/**
 * 
 * 
 * Ei class ta database manage kore
 * 
 */

public class StudentDatabase{
  
  Student [] records;
  
  /**
   * Eita shob dekhai dei
   */
  void printDatabase(){
    int c=0; /* jj*/
    while(c<records.length){ //5
      System.out.println(records[c].toString());
      ++c;
    }
  }
  /**
   * eita name diye sort kore dey
   */
  void sortByName(){
    for(int a=0;a<records.length;a++){
      for(int b=a+1;b<records.length;b++){
        if(records[a].name.compareTo(records[b].name)>0){
        Student temp=records[a];
          records[a]=records[b];
          records[b]=temp;
        }
      }
    }
  }
  void sortByID(){
    for(int i=0;i<records.length;i++){
      for(int j=i+1;j<records.length;j++){
        if(records[i].id.compareTo(records[j].id)>0){
          Student tmp=records[i];
          records[i]=records[j];
          records[j]=tmp;
        }
      }
    }
  }
  void sortBySection(){
    for(int a=0;a<records.length;a++){
      for(int b=a+1;b<records.length;b++){
        if(records[a].section>records[b].section){
          Student temp=records[a];
          records[a]=records[b];
          records[b]=temp;
        }
      }
    }
  }
  void sortByMark(){
    for(int a=0;a<records.length;a++){
      for(int b=a+1;b<records.length;b++){
        if(records[a].mark>records[b].mark){
        Student temp=records[a];
        records[a]=records[b];
        records[b]=temp;
        }
      }
    }
  }
}
