import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookMain {
    public static void main(String[] args) throws PhoneBookExceptionHandling {

        Scanner scan=new Scanner(System.in);
        HashMap<Integer,Phonebook> phonebookHashMap=new HashMap<>();
        boolean exit =false;
        while(!exit)

        {
            System.out.println("Welcome to phonebook");
            System.out.println("Enter your option-\n1.add contacts, 2.display all contacts, 3.search for a particular contact ,4, remove a contact");
           int option= scan.nextInt();
           switch (option)

           {
               case 1:  System.out.println("ADD Contacts in phonebook with respectively name and number");
                   String name=scan.next();
                   int num=scan.nextInt();
                   if(phonebookHashMap.containsKey(num))
                       throw new PhoneBookExceptionHandling("you have to enter new number  in phonebook");
                   else
                       phonebookHashMap.put(num,new Phonebook(name,num));
                   break;
               case 2:
                   if(phonebookHashMap.isEmpty())
                       System.out.println("No contacts present in phonebbok");
                   else {
                       System.out.println("contacts present in phonebook");
                       for (Phonebook ph : phonebookHashMap.values())
                           System.out.println(ph);
                   }
                   break;
               case 3:System.out.println("Enter number to search in phonebook");
                   int phno=scan.nextInt();
                   if(phonebookHashMap.containsKey(phno))
                       System.out.println(phonebookHashMap.get(phno));
                   else
                       throw new PhoneBookExceptionHandling("Number not found in phonebook");
                   break;
               case 4:System.out.println("Enter number to remove from phonebook");
                   int phonenumber=scan.nextInt();
                   if(phonebookHashMap.containsKey(phonenumber)) {
                       phonebookHashMap.remove(phonenumber);
                       System.out.println("number you have have entere is  removed from phonebook");
                   }
                   else
                       throw new PhoneBookExceptionHandling("Number not found in phonebook");
                   break;

               default:throw new PhoneBookExceptionHandling("select correct option");
           }
        }
    }
}
