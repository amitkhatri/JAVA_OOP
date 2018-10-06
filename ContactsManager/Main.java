class Main{
  public static void main(String[] args){
    Contact c1 = new Contact();
    c1.name = "Jack Bauer";
    c1.phoneNumber = "555-555-5555";
    c1.email = "jbauer@ctu.gov";

    Contact c2 = new Contact();
    c2.name = "Tony Almeida";
    c2.phoneNumber = "555-555-5555";
    c2.email = "talmeida@ctu.gov";

    Contact c3 = new Contact();
    c3.name = "Nina Meyers";
    c3.phoneNumber = "555-555-5555";
    c3.email = "nmeyers@ctu.gov";

    ContactsManager contacts = new ContactsManager();

    contacts.addContact(c1);
    contacts.addContact(c2);
    contacts.addContact(c2);

    Contact query = new Contact();
    query = contacts.searchContact("Jack Bauer");
    System.out.println(query.name);
    System.out.println(query.phoneNumber);
    System.out.println(query.email);


  }
}
