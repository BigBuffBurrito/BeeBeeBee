//Lyle Henderson and Ben McDaniel
import java.util.*;
public class UnderdarkTravel {
    public static void main (String [] args) {
        int location;
        int numEncount;
        int currentEncount = 0;
        int encounter;
        int dHundred;
        int dTwenty;
        int dTwelve;
        int dTen;
        int dEight;
        int dSix;
        int dFour;
        int dThree;
        int dTwo ;
        int terrain;
        int varOne;
        int varTwo;
        int varThree;
        int varFour;
        int varFinal;
        int varFinaltwo;
        int varCurrent = 0;
        int varEnd = 0;
        int passage;
        int light;
        int magic;
        int creature = 0;
        Scanner scan = new Scanner (System.in);
        Scanner scantwo = new Scanner (System.in);
        System.out.print ("Where are you traveling? 1. The Underdark, 2. The Darklake, 3. Grackstugh, 4. Neverlight Grove, or 5. Blingdenstone?: ");
        location = scan.nextInt();
        while (location == 1) {
            System.out.print ("How many encounters would you like generated?: ");
            numEncount = scan.nextInt();
            while (currentEncount != numEncount) {
                encounter = (int) ((20 - 1 + 1) * Math.random() + 1);
                if (encounter <= 13) {
                    System.out.println ("No encounter");
                    currentEncount = currentEncount + 1;
                } else if (encounter == 14 || encounter == 15) {
                    System.out.println ("Terrain Encounter:");
                    terrain = (int) ((20 - 1 + 1) * Math.random() + 1);
                    currentEncount = currentEncount + 1;
                    if (terrain == 1) {
                        System.out.println ("Boneyard");
                        passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }
                        dTwenty = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (dTwenty <= 14) {
                            System.out.println ("No encounter at Boneyard");
                            
                        } else if (dTwenty == 15 || dTwenty == 16 || dTwenty == 17 || dTwenty == 18) {
                            varOne = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varTwo = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varThree = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varFinal = varOne + varTwo + varThree;
                            System.out.println (varFinal + "Skeletons");
                            
                        } else {
                            varOne = (int) ((3 - 1 + 1) * Math.random() + 1);
                            System.out.println (varOne + "Minotaur Skeletons");
                            
                        }
                    } else if (terrain == 2) {
                        varOne = (int) ((4 - 1 + 1) * Math.random() + 1);;
                        varTwo = (int) ((4 - 1 + 1) * Math.random() + 1);;
                        varFinal = (varOne + varTwo) * 10;
                        System.out.println (varFinal + " foot cliff with a rope ladder at the top");
                        passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }
                        
                    } else if (terrain == 3) {
                        System.out.println ("Crystal Clusters");
                        passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }  
                    } else if (terrain == 4) {
                        System.out.println ("Fungus Cavern");
                        passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }
                        varEnd = (int) ((6 - 1 + 1) * Math.random() + 1);
                        while (varCurrent != varEnd) {
                            if (varEnd == 1) {
                                dHundred = (int) ((100 - 1 + 1) * Math.random() + 1);
                               if (dHundred <= 10) {
                                System.out.println ("Barrelstalk");
                                varCurrent = varCurrent + 1;
                            } else if (dHundred >= 11 && dHundred<= 20) {
                                System.out.println ("Bluecap");
                                varCurrent = varCurrent + 1;
                            }else if (dHundred >= 21 && dHundred <= 30) {
                                System.out.println ("Fire Lichen");
                                varCurrent = varCurrent + 1;
                            } else if (dHundred >= 31 && dHundred<= 40) {
                                System.out.println ("Ripplebark");
                                varCurrent = varCurrent + 1;
                            } else if (dHundred >= 41 && dHundred<= 50) {
                                System.out.println ("Trillimac");
                                varCurrent = varCurrent + 1;
                            } else if (dHundred >= 51 && dHundred<= 60) {
                                System.out.println ("Waterorb");
                                varCurrent = varCurrent + 1;
                            } else if (dHundred >= 61 && dHundred<= 70) {
                                System.out.println ("Zurkhwood");
                                varCurrent = varCurrent + 1;
                            } else if (dHundred >= 71 && dHundred<= 75) {
                                System.out.println ("Nightlight");
                                varCurrent = varCurrent + 1;
                            } else if (dHundred >= 76 && dHundred<= 80) {
                                System.out.println ("Nilhogg's Nose");
                                varCurrent = varCurrent + 1;
                            } else if (dHundred >= 81 && dHundred<= 85) {
                                System.out.println ("Ormu");
                                varCurrent = varCurrent + 1;
                            } else if (dHundred >= 86 && dHundred<= 90) {
                                System.out.println ("Timmask");
                                varCurrent = varCurrent + 1;
                            } else if (dHundred >= 91 && dHundred<= 95) {
                                System.out.println ("Tongue of Madness");
                                varCurrent = varCurrent + 1;
                            } else {
                                System.out.println ("Torchstalk");
                                varCurrent = varCurrent + 1;
                            }
                        }   
                    } 
                    } else if (terrain == 5) {
                            System.out.println ("Gas Leak");
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }    
                    } else if (terrain == 6) {
                            varOne = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varTwo = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varFinal = (varOne + varTwo) * 100;
                            System.out.println (varFinal + " foot tall gorge");
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }     
                        } else if (terrain == 7) {
                            varOne = (int) ((6 - 1 + 1) * Math.random() + 1);
                            varTwo = (int) ((6 - 1 + 1) * Math.random() + 1);
                            varFinal = (varOne + varTwo) * 10;
                            System.out.println ("High ledge next to " + varFinal + " foot deep ravine");
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }    
                        } else if (terrain == 8) {
                            System.out.println ("Horrid Sounds");
                            
                        } else if (terrain == 9) {
                            System.out.println ("Lava Swell");
                           
                        } else if (terrain == 10) {
                            System.out.println ("Muck Pit");
                            
                        } else if (terrain == 11) {
                            System.out.println ("Rock Fall");
                            
                        } else if (terrain == 12) {
                            varOne = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varTwo = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varThree = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varFour = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varFinal = (varOne + varTwo) * 10;
                            varFinaltwo = (varThree + varFour) * 10;
                            System.out.println ("Rope bridge over a " + varFinal + " foot wide and " + varFinaltwo + " foot deep ravine");
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }    
                        } else if (terrain == 13) {
                            System.out.println ("Ruins");
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }     
                        } else if (terrain == 14) {
                            System.out.println ("Shelter");
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }     
                        } else if (terrain == 15) {
                            System.out.println ("Sinkhole");
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }     
                        } else if (terrain == 16) {
                            dSix = (int) ((6 - 1 + 1) * Math.random() + 1);
                            if (dSix == 1 || dSix == 2 || dSix == 3) {
                                System.out.println ("Patch of Green Slime");
                                
                            } else if (dSix == 4 || dSix == 5) {
                                System.out.println ("Patch of Yellow Mold");
                                
                            } else {
                                System.out.println ("Patch of Brown Mold");
                                
                            }
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }
                        } else if (terrain == 17) {
                            System.out.println ("Steam Vent");
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }     
                        } else if (terrain == 18) {
                            varOne = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varTwo = (int) ((4 - 1 + 1) * Math.random() + 1);
                            varFinal = (varOne + varTwo) * 5;
                            System.out.println (varFinal + " foot wide underground stream");
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }    
                        } else if (terrain == 19) {
                            System.out.println ("Warning Sign");
                            dTwenty = (int) ((20 - 1 + 1) * Math.random() + 1);
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }      
                            if (dTwenty <= 14) {
                                System.out.println ("No Encounter at warning sign");
                                
                            } else if (dTwenty == 15 || dTwenty == 16) {
                                System.out.println ("1 Invisible Barlgura");
                                
                            } else if (dTwenty == 17 || dTwenty == 18) {
                                varOne = (int) ((4 - 1 + 1) * Math.random() + 1);
                                varTwo = (int) ((4 - 1 + 1) * Math.random() + 1);
                                varThree = (int) ((4 - 1 + 1) * Math.random() + 1);
                                varFinal = varOne + varTwo + varThree;
                                System.out.println (varFinal + "Dretches");
                                
                            } else {
                                dTwo = (int) ((2 - 1 + 1) * Math.random() + 1);;
                                if (dTwo == 1) {
                                    System.out.println ("1 Shadow Demon");
                                   
                                } else {
                                    System.out.println ("2 Shadow Demons");
                                    
                                }
                            }
                        } else {
                            System.out.println ("Webs");
                            passage = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (passage == 1 || passage == 2) {
                            System.out.println ("Narrow Passageway");
                        } else if (passage == 3 || passage == 4) {
                            System.out.println ("Standard Passageway");
                        } else {
                            System.out.println ("Open Area");
                        }
                        light = (int) ((6 - 1 + 1) * Math.random() + 1);
                        magic = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (light == 1 || light == 2 || light == 3 && magic <= 10) {
                            System.out.println ("Dimly lit, no faerzress");
                        } else if (light == 1 || light == 2 || light == 3 && magic >= 11) {
                            System.out.println ("Dimly lit by faerzress");
                        } else {
                            System.out.println ("Dark, light source required");
                        }     
                        }
                } else if (encounter == 16 || encounter == 17) {
                    System.out.println ("Creature encounter:");
                    currentEncount = currentEncount + 1;
                    creature = (int) ((20 - 1 + 1) * Math.random() + 1);
                    if (creature > 5 && creature <= 20) {
                        System.out.println ("Not Coded Yet");
                    }
                    if (creature == 1 || creature == 2) {
                        System.out.println ("Ambushers");
                        dTwenty = (int) ((20 - 1 + 1) * Math.random() + 1);
                        if (dTwenty == 1 || dTwenty == 2) {
                            System.out.println ("1 chuul lurking in a pool of water");       
                        } else if (dTwenty == 3) {
                            varOne = (int) ((6 - 1 + 1) * Math.random() + 1);
                            if (varOne == 1) {
                                System.out.println (varOne + " giant spider clinging to the walls/ceiling");            
                            } else {
                                System.out.println (varOne + " giant spiders clinging to the walls/ceiling");    
                            }
                        } else if (dTwenty == 4 || dTwenty == 5) {
                            System.out.println ("1 grell floating near the high ceiling");   
                        } else if (dTwenty >= 6 && dTwenty <= 9) {
                            varOne = (int) ((4 - 1 + 1) * Math.random() + 1);
                            if (varOne != 1) {
                                System.out.println (varOne + " gricks hiding in a crevice/fissure");      
                            } else {
                                System.out.println (varOne + " grick hiding in a crevice/fissure");          
                            }
                        } else if (dTwenty >= 10 && dTwenty <= 15) {
                            varOne = (int) ((4 - 1 + 1) * Math.random() + 1);
                            if (varOne != 1) {
                                System.out.println (varOne + "orogs perching on ledges");       
                            } else {
                                System.out.println (varOne + "orog perching on a ledge");       
                            }
                        } else if (dTwenty == 16 || dTwenty == 17) {
                            varOne = (int) ((6 - 1 + 1) * Math.random() + 1);
                            if (varOne != 1) {
                                System.out.println (varOne + "piercers masquerading as stalagtites");        
                            } else {
                                System.out.println (varOne + "piercer masquerading as a stalagtite");    
                            }
                        } else {
                            System.out.println ("1 umber hulk bursting out of a nearby wall");  
                        }
                        }
                    } else if (creature == 3) {
                        dHundred = (int) ((100 - 1 + 1) * Math.random() + 1);
                        if (dHundred >= 75) {
                            System.out.println ("Carrion Crawler, domesticated");  
                        } else {
                            System.out.println ("Carrion Crawler, not domesticated");  
                        }
                    } else if (creature == 4 || creature == 5) {
                        dFour = (int) ((4 - 1 + 1) * Math.random() + 1);
                        if (dFour == 1) {
                        dTwo = (int) ((2 - 1 + 1) * Math.random() + 1);
                        if (dTwo != 2) {
                            System.out.println (dTwo + " escaped moon elf commoner slave");  
                        } else {
                            System.out.println (dTwo + " escaped moon elf commoner slaves");     
                        }
                    } else if (dFour == 2) {
                        dThree = (int) ((3 - 1 + 1) * Math.random() + 1);
                        if (dThree != 1) {
                            System.out.println (dThree + " escaped shield dwarf commoner slaves");     
                        } else {
                            System.out.println (dThree + " escaped shield dwarf commoner slave");       
                        }
                    } else if (dFour == 3) {
                        varOne = (int) ((4 - 1 + 1) * Math.random() + 1);
                            if (varOne != 1) {
                            System.out.println (varOne + " escaped human commoner slaves");   
                        } else {
                            System.out.println (varOne + " escaped human commoner slave");  
                        }
                    }else {
                        dSix = (int) ((6 - 1 + 1) * Math.random() + 1);
                        if (dSix != 1) {
                            System.out.println (dSix + "escaped goblin slaves"); 
                        } else {
                            System.out.println (dSix + "escaped goblin slave");
                        }
                    }
                }else {
                    System.out.println ("Not Yet Coded");
        }
        System.out.println ("------------------------------");
    }
      currentEncount = 0;
}
}
}
// Current Issues:
//Blank creature encounters being generated
//escap4ed slave encounters not printing with "Creature Encounter:" prefix

//GITHUB TIME                 
                                
                            
                            
                                
                            
                        
                        
                            
                           
                    
               
                
                           
                        
                       
                            
                    
                    
                
                
                
                
                
                
                
                
            
            
            
        
