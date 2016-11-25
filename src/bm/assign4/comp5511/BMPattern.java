
package bm.assign4.comp5511;


public class BMPattern {
    String[] ref_file =       {"a","b","c","a","c","a","b","b"};
    String[] inputPattern   = {"a","b","b"};
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
                 for (int j=0; j<arraysize-i;j++){
                 ref_file[j]=ref_file[j+i];
                 }
                break;
               }  
            }
            //if nothing matches, move right by i boxes
              if (i == inputPattern.length){
                  for (int j=0; j<arraysize-i;j++){
                 ref_file[j]=ref_file[j+i];
                 }
              }
            arraysize = arraysize - i;
            indexx = indexx + i;
            CallBM();
             }
           
      
         }
    
    
    public void Print(){

        System.out.println("index is found at: "+ indexx + "    ");
        System.out.print("Number of comparisions are: "+ compare + "    ");
    }
    
} 
   
    

    
    
    

