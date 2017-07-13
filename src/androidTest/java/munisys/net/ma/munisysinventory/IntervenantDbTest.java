package munisys.net.ma.munisysinventory;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;

import munisys.net.ma.munisysinventory.dao.Db_Invenantaire;
import munisys.net.ma.munisysinventory.dao.Db_gest;
import munisys.net.ma.munisysinventory.entities.Intervenant;

import static org.junit.Assert.assertEquals;

/**
 * Created by mehdibouhafs on 09/07/2017.
 */
@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IntervenantDbTest {

    private Db_Invenantaire db;

    private Context context;



    @Before
    public void instantiate(){
        this.context = InstrumentationRegistry.getTargetContext();
        this.db = new Db_Invenantaire(context,8);
    }


    @Test
    public void get_isCorrect() throws Exception {
        Intervenant intervenant =  this.db.getIntervenant(2);
        Log.e("Get intervenant ",intervenant.getNomIntervenant() +" id " + intervenant.getId());
        assertEquals(intervenant.getId(), 2);
    }



    @Test
    public void insert_isCorrect() throws Exception {
        /*this.db.insererIntervenant("testIntervenant0");
        this.db.insererIntervenant("testIntervenant1");
        this.db.insererIntervenant("testIntervenant2");
        this.db.insererIntervenant("testIntervenant3");
        this.db.insererIntervenant("testIntervenant4");*/
        ArrayList<Intervenant> intervenants =  this.db.getAllIntervenants();
        for (Intervenant e:intervenants
                ) {
            Log.e("intervenant ",e.getNomIntervenant() +" id " + e.getId());
        }
        assertEquals(intervenants.size(), 5);
    }



    // Intervenant

   /* @Test
    public void delete_isCorrect() throws Exception {
        this.db.deleteIntervenant(1);
        assertEquals(this.db.getAllIntervenants().size(),3);
    }*/



}
