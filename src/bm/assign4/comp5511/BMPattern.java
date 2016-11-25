
package bm.assign4.comp5511;


public class BMPattern {
    String[] ref_file =       {"a","b","c","b","c","b","b","c"};
    String[] inputPattern   = {"b","b","c"};
    int arraysize = ref_file.length;
    public static int indexx;
    public static int compare=0;
    int TStart = inputPattern.length-1;
    int BStart = inputPattern.length-1;
    
    
    public void CallBM(){
          
           //Match
        if (ref_file[TStart] == inputPattern[BStart]) { 
            compare++;
            if(BStart ==0)//Last match
            {
                    System.out.println("Using BM Pattern:");
        System.out.println("Index is found at: "+ indexx + "    ");
        System.out.println("Number of comparisions are: "+ compare + "    ");
                return;
            }   
        TStart--;//are we setting tsart back to 3 after? we should
        BStart--;  //same for bstart
        CallBM();     
        }

        else{//if not matched, look at next
           compare++; 
            int i =0;
            for( i=1; i<=BStart ;i++){
               compare++; 
              if(ref_file[TStart]==inputPattern[BStart-i]){
                 
                  //if next is a match, then 
                 for (int j=0; j<arraysize-i;j++){
                 ref_file[j]=ref_file[j+i];
                 }
                break;
               }  
            }
            //if nothing matches, move right by i boxes
              if (i == BStart+1){
                     if(inputPattern.length == arraysize)
                     { 
                         System.out.println("No Match!");
                         return;
                    }
                  
                 for (int j=0; j<arraysize-i;j++){
                 ref_file[j]=ref_file[j+i];
                 }
              }
            arraysize = arraysize - i;
            indexx = indexx + i;
            TStart = inputPattern.length-1;
            BStart = inputPattern.length-1;
            CallBM();
            
             }
         }
    
    
} 
   
    

    
    
    

