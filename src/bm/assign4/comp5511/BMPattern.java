
package bm.assign4.comp5511;


public class BMPattern {
    String[] ref_file =       {"a","b","b","b","a"};
    String[] inputPattern   = {"b","b","a"};
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
        TStart--;
        BStart--;  
        CallBM();     
        }

        else{//if not matched, look at next
           compare++; 
            int i =0;
            for( i=1; i<=BStart ;i++){
               compare++; 
              if(ref_file[TStart]==inputPattern[BStart-i]){
                 
                  //if next is a match, then
                  if(arraysize >= i + inputPattern.length){
                 for (int j=0; j<arraysize-i;j++){
                 ref_file[j]=ref_file[j+i];
                 }
                  }
                 else  {System.out.println("No Match!");
                         System.out.println("Number of comparisions are: "+ compare + "    ");
                      return;}
                 
                break;
               }  
            }
            //if nothing matches, move right by i boxes
              if (i == BStart+1){
                  
                     if((inputPattern.length == arraysize) || (inputPattern.length+ i > arraysize ))
                     { 
                         System.out.println("No Match!");
                         System.out.println("Number of comparisions are: "+ compare + "    ");
                         return;
                    }
                     
                   //HERE!!! need to check if the array is long enough
                  if(ref_file.length >= i + inputPattern.length){
                 for (int j=0; j<arraysize-i;j++){
                 ref_file[j]=ref_file[j+i];
                 }
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
   
    

    
    
    

