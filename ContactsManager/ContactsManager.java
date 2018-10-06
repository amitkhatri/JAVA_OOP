class ContactsManager{

  Contact[] contacts;
  int currentEntry;

  ContactsManager(){
    contacts = new Contact[100];
    currentEntry = 0;
  }

  void addContact(Contact newContact){
    contacts[currentEntry] = newContact;
    currentEntry++;
  }

  Contact searchContact(String searchName){
    for(int i=0; i<currentEntry; i++){
      if(contacts[i].name.equals(searchName)){
        return contacts[i];
      }
    }
    return null;
  }
}
