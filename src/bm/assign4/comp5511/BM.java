
package bm.assign4.comp5511;


public class BM {
    String[] ref_file =       {"a","b","c","a","c","a","b","b"};
    String[] inputPattern   = {"a","b","b"};
    int arraysize = ref_file.length;
    public int indexx;
    
    public static void main(String[] args) {
    BM call = new BM();
    call.Call();
    BM print = new BM();
    print.Print();
    }
    
    int TStart = inputPattern.length-1;
    int BStart = inputPattern.length-1;
    int compare=1;
    public void Call(){

        while (BStart != -1 ){
        
           
        if (ref_file[TStart] == inputPattern[BStart]) { 
           
            if(BStart ==0)
            { //System.out.print("Got it");
                break;}    
        TStart--;
        BStart--;  
        Call(); 
        }
        
        
        else{
            
           System.out.println("Number of compares:  "+ compare);
           compare += compare;
            int i =0;
            for( i=1; i<=BStart ;i++){
              if(ref_file[TStart]==inputPattern[BStart-i]){
                  
                 for (int j=0; j<arraysize-i;j++){
                 ref_file[j]=ref_file[j+i];
                 }
                break;
               }  
            }
              if (i == inputPattern.length){
                  for (int j=0; j<arraysize-i;j++){
                 ref_file[j]=ref_file[j+i];
                 }
              }
            arraysize = arraysize - i;
            System.out.println("Move right by " + i + " spaces");
            indexx = indexx + i;
            System.out.println("new index is now: "+ indexx + "    ");
            System.out.println();
            Call();
            

             }
           }
      
         }
    
    
    public void Print(){
        /*
        System.out.println("Reference text is:");
        for(int i=0;i<ref_file.length;i++){
               System.out.print(ref_file[i] + " " );   
        }
        System.out.println();
        System.out.println("Pattern search index is:");
         for(int i=0;i<inputPattern.length;i++){
               System.out.print(inputPattern[i] + " " );   
        }
        System.out.println();
        return indexx;
        System.out.print("index is found at: "+ indexx + "    ");
    */
    }
    
} 
   
    
