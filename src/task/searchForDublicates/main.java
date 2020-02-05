package task.searchForDublicates;

import colectioms.Colection;
import org.omg.CORBA.UserException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public  class main {
    public static void main(String[] args) {
        Collection<User> users1 = new ArrayList<User>();
        Collection<User> users2 = new ArrayList<User>();
        UserDublicates dublicates = new UserDublicates();
        List<User> listDuvlicates = new ArrayList();
        users1.add(new User("Ruslan","Ruslan.pipan@ukr.net", new byte[1]));
        users1.add(new User("Basya","Basya.pipan@ukr.net", new byte[2]));
        users1.add(new User("Igor","Igor.pipan@ukr.net", new byte[3]));
        users1.add(new User("Anton","Anton.pipan@ukr.net", new byte[4]));
        users1.add(new User("Alina","Alina.pipan@ukr.net", new byte[5]));
        users1.add(new User("Diana","Diana.pipan@ukr.net", new byte[6]));

        users1.add(new User("Dsssiana","Dsssiana.pipan@ukr.net", new byte[10]));

        users2.add(new User("Ruslan","Ruslan.pipan@ukr.net", new byte[1]));
        users2.add(new User("Basya","Basya.pipan@ukr.net", new byte[2]));
        users2.add(new User("Igor","Igor.pipan@ukr.net", new byte[3]));
        users2.add(new User("Anton","Anton.pipan@ukr.net", new byte[4]));
        users2.add(new User("Alina","Alina.pipan@ukr.net", new byte[5]));
        users2.add(new User("Diana","Diana.pipan@ukr.net", new byte[6]));

        listDuvlicates = dublicates.findDuplicates(users1, users2);

        for (User tmp: listDuvlicates) {
            System.out.println(tmp.toString());
        }
    }
}
