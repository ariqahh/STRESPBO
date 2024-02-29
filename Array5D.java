package arrayscanner;
public class Arrayscanner {
    public static void main(String[] args) {
     int angka [][][][][] = {
         {
             {
                 {
                     {1,2,3,4,5},
                     {6,7,8,9,10}
                 }
             }
         },
             {
                 {
                     {
                        {11,12,13,14},
                         {15,16,17,18}
                     }
                 }  
             }
     };
             
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j <angka[i].length; j++) {
                for (int k = 0; k <angka[i][j].length; k++) {
                    for (int l = 0; l <angka[i][j][k].length; l++) {
                        for (int m = 0; m <angka[i][j][k][l].length; m++) {
                            System.out.println("["+i+"]["+j+"]["+k+"]["+l+"]["+m+"]"+" = "+angka[i][j][k][l][m]);   
                        }
                    }
                }
            }
        }
        
        double angka1 [][][][][] = {
         {
             {
                 {
                     {1.2, 3.4, 5.6},
                     {6.7, 8.9, 10.11}
                 }
                 
             }
         },
            {
                {
                    {
                        {2.1,2.2,2.3},
                        {3.1,3.2,3.4}
                    }
                }
            }
     };
        for (int i = 0; i < angka1.length; i++) {
            for (int j = 0; j < angka1[i].length; j++) {
                for (int k = 0; k <angka1[i][j].length; k++) {
                    for (int l = 0; l <angka1[i][j][k].length; l++) {
                        for (int m = 0; m < angka1[i][j][k][l].length; m++) {
                           System.out.println("["+i+"]["+j+"]["+k+"]["+l+"]["+m+"]"+" = "+angka1[i][j][k][l][m]); 
                        }
                    }
                }
            }
            
        }
        char angka2 [][][][][] = {
         {
             {
                 {
                     {'A','B','C'},
                     {'D','E','F'}
                 }
                 
             }
         },
            {
                {
                    {
                        {'G','H','I'},
                        {'J','K','L'}
                    }
                }
            }
     };
        for (int i = 0; i < angka1.length; i++) {
            for (int j = 0; j < angka1[i].length; j++) {
                for (int k = 0; k <angka1[i][j].length; k++) {
                    for (int l = 0; l <angka1[i][j][k].length; l++) {
                        for (int m = 0; m < angka1[i][j][k][l].length; m++) {
                           System.out.println("["+i+"]["+j+"]["+k+"]["+l+"]["+m+"]"+" = "+angka2[i][j][k][l][m]); 
                        }
                    }
                }
            }
            
        }
        
        float angka3 [][][][][] = {
         {
             {
                 {
                     {1.2f, 3.4f, 5.6f},
                     {6.7f, 8.9f, 10.11f}
                 }
                 
             }
         },
            {
                {
                    {
                        {2.1f, 2.2f, 2.3f},
                        {3.1f, 3.2f, 3.4f}
                    }
                }
            }
     };
        for (int i = 0; i < angka1.length; i++) {
            for (int j = 0; j < angka1[i].length; j++) {
                for (int k = 0; k <angka1[i][j].length; k++) {
                    for (int l = 0; l <angka1[i][j][k].length; l++) {
                        for (int m = 0; m < angka1[i][j][k][l].length; m++) {
                           System.out.println("["+i+"]["+j+"]["+k+"]["+l+"]["+m+"]"+" = "+angka3[i][j][k][l][m]); 
                        }
                    }
                }
            }
            
        }
    //non primitif
        Double angka4 [][][][][] = {
         {
             {
                 {
                     {1.1, 3.3, 5.5},
                     {6.78, 8.90, 10.11}
                 }
                 
             }
         },
            {
                {
                    {
                        {9.8, 8.7, 6.5},
                        {4.3, 3.2, 2.1}
                    }
                }
            }
     };
        for (int i = 0; i < angka1.length; i++) {
            for (int j = 0; j < angka1[i].length; j++) {
                for (int k = 0; k <angka1[i][j].length; k++) {
                    for (int l = 0; l <angka1[i][j][k].length; l++) {
                        for (int m = 0; m < angka1[i][j][k][l].length; m++) {
                           System.out.println("["+i+"]["+j+"]["+k+"]["+l+"]["+m+"]"+" = "+angka4[i][j][k][l][m]); 
                        }
                    }
                }
            }
            
        }
        Integer angka5 [][][][][] = {
         {
             {
                 {
                     {2001, 2002, 2003},
                     {2004, 2005, 2006}
                 }           
             }
         },
            {
                {
                    {
                        {1, 2, 3, 4},
                        {5, 6, 7}
                    }
                }
            }
     };
        for (int i = 0; i < angka1.length; i++) {
            for (int j = 0; j < angka1[i].length; j++) {
                for (int k = 0; k <angka1[i][j].length; k++) {
                    for (int l = 0; l <angka1[i][j][k].length; l++) {
                        for (int m = 0; m < angka1[i][j][k][l].length; m++) {
                           System.out.println("["+i+"]["+j+"]["+k+"]["+l+"]["+m+"]"+" = "+angka5[i][j][k][l][m]); 
                        }
                    }
                }
            }
            
        }
        String nama [][][][][] = {
         {
             {
                 {
                     {"cika", "andi", "ana"},
                     {"iky", "bahar", "fosalgo"}
                 }
                 
             }
         },
            {
                {
                    {
                        {"majene", "mamuju", "campa"},
                        {"fakultas", "teknik" , "unsulbar"}
                    }
                }
            }
     };
        for (int i = 0; i < angka1.length; i++) {
            for (int j = 0; j < angka1[i].length; j++) {
                for (int k = 0; k <angka1[i][j].length; k++) {
                    for (int l = 0; l <angka1[i][j][k].length; l++) {
                        for (int m = 0; m < angka1[i][j][k][l].length; m++) {
                           System.out.println("["+i+"]["+j+"]["+k+"]["+l+"]["+m+"]"+" = "+nama[i][j][k][l][m]); 
                        }
                    }
                }
            }
            
        }
    }
    }
