package textfiles;
import java.io.*;
import java.util.*;

public class compileSix {

	public static void main(String[] args) throws IOException {
		boolean Comp = true;
		while(Comp){
			Scanner Scan = new Scanner(System.in);
			System.out.println("Enter Team Number");
			String Com = Scan.next();
			String file_name = Com+ ".txt";
			
			//Each set of info is 14 lines (1-12 used)
			
			try{
				ReadFile file = new ReadFile(file_name);
				String[] aryLines = file.OpenFile();
				int i;
				for(i=0; i < aryLines.length; i++ ){
				
	//				String[] bob = aryLines[i].split("");
				//	String a = bob.replaceAll("[^0-9]", "");
				/*	//String bobitoito = bob[i].replaceAll("[0-9]", "");
					String pomo = bob[i].replaceAll("[0-9]", "");
										//int[] bobito = new int[bob.length];
					int bobito = Integer.parseInt(pomo, bob.length);
										System.out.println(bobito);

					for(int n=0; n < aryLines.length; n++){
				*/		
						//bobito[n] = Integer.parseInt(aryLines[n]);
					}
					//int foo = Integer.parseInt(a);
					//String[] food = a.split(",");
					//System.out.println(food);
				//	System.out.println(bobito);
				//	String test = aryLines[i].replaceAll("[0-9]", "");
				/*	
				//	Scanner Scan2 = new Scanner(System.in);
					String line = Scan.next();
					String[] numberStrs = line.split(System.getProperty("line.separator"));
					//String[] numberStrs = line.split("a");

					int numbers[] = new int[numberStrs.length];
					for(int b = 0;b < numberStrs.length;b++)
					
				*/	   // Note that this is assuming valid input
					   // If you want to check then add a try/catch 
					   // and another index for the numbers if to continue adding the others
					  // numbers[b] = Integer.parseInt(numberStrs[b]);
					/*
					System.out.println(numbers[i]);
				*/
					//System.out.println(aryLines[i]);
//System.out.println(test);
 
					//String bob2 = aryLines[1];
					//String aryParsed[] = a;
					//String bob2 = a[1];
					//String a = bob.replaceAll("[^0-9]", "");
					//int foo = Integer.parseInt(a);
					//System.out.println(foo);
					//int gogogo = i-1;
					//System.out.println(i);
					String bob = aryLines[0];
					String a = bob.replaceAll("[^0-9]", "");
					double foo = Integer.parseInt(a);
					/*String bob2 = aryLines[1];
					String b = bob2.replaceAll("[^0-9]", "");
					double foo2 = Integer.parseInt(b);
					*/
					String bob3 = aryLines[2];
					String c = bob3.replaceAll("[^0-9]", "");
					double foo3 = Integer.parseInt(c);
					String bob4 = aryLines[3];
					String d = bob4.replaceAll("[^0-9]", "");
					double foo4 = Integer.parseInt(d);
					String bob5 = aryLines[4];
					String e = bob3.replaceAll("[^0-9]", "");
					double foo5 = Integer.parseInt(e);
					String bob6 = aryLines[5];
					String f = bob6.replaceAll("[^0-9]", "");
					double foo6 = Integer.parseInt(f);
					//System.out.println(foo5);
					//System.out.println(foo6);
					String bob7 = aryLines[6];
					String g = bob7.replaceAll("[^0-9]", "");
					double foo7 = Integer.parseInt(g);
					//System.out.println(foo7);
					String bob8 = aryLines[7];
					String j = bob8.replaceAll("[^0-9]", "");
					double foo8 = Integer.parseInt(j);
					//System.out.println(foo8);
					String bob9 = aryLines[8];
					String k = bob9.replaceAll("[^0-9]", "");
					double foo9 = Integer.parseInt(k);
					String bob10 = aryLines[9];
					String l = bob10.replaceAll("[^0-9]", "");
					double foo10 = Integer.parseInt(l);
					String bob11 = aryLines[10];
					String m = bob11.replaceAll("[^0-9]", "");
					double foo11 = Integer.parseInt(m);
					String bob12 = aryLines[11];
					String n = bob12.replaceAll("[^0-9]", "");
					double foo12 = Integer.parseInt(n);
					String bob13 = aryLines[12];
					String o = bob13.replaceAll("[^0-9]", "");
					double foo13 = Integer.parseInt(o);
					String bob14 = aryLines[13];
					String p = bob14.replaceAll("[^0-9]", "");
					double foo14 = Integer.parseInt(p);
					
					/*String bob15 = aryLines[14];
					String q  = bob15.replaceAll("[^0-9]", "");
					double foo15 = Integer.parseInt(q);
					*/
					String bob16 = aryLines[15];
					String r = bob16.replaceAll("[^0-9]", "");
					double foo16 = Integer.parseInt(r);
					String bob17 = aryLines[16];
					String s = bob17.replaceAll("[^0-9]", "");
					double foo17 = Integer.parseInt(s);
					String bob18 = aryLines[17];
					String t = bob18.replaceAll("[^0-9]", "");
					double foo18 = Integer.parseInt(t);
					String bob19 = aryLines[18];
					String u = bob19.replaceAll("[^0-9]", "");
					double foo19 = Integer.parseInt(u);
					String bob20 = aryLines[19];
					String v = bob20.replaceAll("[^0-9]", "");
					double foo20 = Integer.parseInt(v);
					String bob21 = aryLines[20];
					String w = bob21.replaceAll("[^0-9]", "");
					double foo21 = Integer.parseInt(w);
					String bob22 = aryLines[21];
					String x = bob22.replaceAll("[^0-9]", "");
					double foo22 = Integer.parseInt(x);
					String bob23 = aryLines[22];
					String y = bob23.replaceAll("[^0-9]", "");
					double foo23 = Integer.parseInt(y);
					String bob24 = aryLines[23];
					String h = bob24.replaceAll("[^0-9]", "");
					double foo24 = Integer.parseInt(h);
					String bob25 = aryLines[24];
					String z = bob25.replaceAll("[^0-9]", "");
					double foo25 = Integer.parseInt(z);
					String bob26 = aryLines[25];
					String aa = bob26.replaceAll("[^0-9]", "");
					double foo26 = Integer.parseInt(aa);
					
					String bob27 = aryLines[26];
					String ba = bob27.replaceAll("[^0-9]", "");
					double foo27 = Integer.parseInt(ba);
				/*	String bob28 = aryLines[27];
					String ca = bob28.replaceAll("[^0-9]", "");
					double foo28 = Integer.parseInt(ca);
					*/
					String bob29 = aryLines[28];
					
					String da = bob29.replaceAll("[^0-9]", "");
					double foo29 = Integer.parseInt(da);
					String bob30 = aryLines[29];
					String ea = bob30.replaceAll("[^0-9]", "");
					double foo30 =Integer.parseInt(ea);
					String bob31 = aryLines[30];
					String fa = bob31.replaceAll("[^0-9]", "");
					double foo31 = Integer.parseInt(fa);	
					String bob32 = aryLines[31];
					String ga = bob32.replaceAll("[^0-9]", "");
					double foo32 = Integer.parseInt(ga);
					String bob33 = aryLines[32];
					String ha = bob33.replaceAll("[^0-9]", "");
					double foo33 = Integer.parseInt(ha);
					String bob34 = aryLines[33];
					String ia = bob34.replaceAll("[^0-9]", "");
					double foo34 = Integer.parseInt(ia);
					String bob35 = aryLines[34];
					String ja = bob35.replaceAll("[^0-9]", "");
					double foo35 = Integer.parseInt(ja);
					String bob36 = aryLines[35];
					String ka = bob36.replaceAll("[^0-9]", "");
					double foo36 = Integer.parseInt(ka);
					String bob37 = aryLines[36];
					String la = bob37.replaceAll("[^0-9]", "");
					double foo37 = Integer.parseInt(la);
					String bob38 = aryLines[37];
					String ma = bob38.replaceAll("[^0-9]", "");
					double foo38 = Integer.parseInt(ma);
					
					String bob39 = aryLines[38];
					String na = bob39.replaceAll("[^0-9]", "");
					double foo39 = Integer.parseInt(na);
					String bob40 = aryLines[39];
					String oa = bob40.replaceAll("[^0-9]", "");
					double foo40 = Integer.parseInt(oa);
				/*	String bob41 = aryLines[40];
					String pa = bob41.replaceAll("[^0-9]", "");
					double foo41 = Integer.parseInt(pa);
					*/
					String bob42 = aryLines[41];
					String qa = bob42.replaceAll("[^0-9]", "");
					double foo42 = Integer.parseInt(qa);
					String bob43 = aryLines[42];
					String ra = bob43.replaceAll("[^0-9]", "");
					double foo43 = Integer.parseInt(ra);
					String bob44 = aryLines[43];
					String sa = bob44.replaceAll("[^0-9]", "");
					double foo44 = Integer.parseInt(sa);
					String bob45 = aryLines[44];
					String ta = bob45.replaceAll("[^0-9]", "");
					double foo45 = Integer.parseInt(ta);
					String bob46 = aryLines[45];
					String ua = bob46.replaceAll("[^0-9]", "");
					double foo46 = Integer.parseInt(ua);
					String bob47 = aryLines[46];
					String va = bob47.replaceAll("[^0-9]", "");
					double foo47 = Integer.parseInt(va);
					String bob48 = aryLines[47];
					String wa = bob48.replaceAll("[^0-9]", "");
					double foo48 = Integer.parseInt(wa);
					String bob49 = aryLines[48];
					String xa = bob49.replaceAll("[^0-9]", "");
					double foo49 = Integer.parseInt(xa);
					String bob50 = aryLines[49];
					String ya = bob50.replaceAll("[^0-9]", "");
					double foo50 = Integer.parseInt(ya);
					
					String bob51 = aryLines[50];
					String za = bob51.replaceAll("[^0-9]", "");
					double foo51 = Integer.parseInt(za);
					String bob52 = aryLines[51];
					String ab = bob52.replaceAll("[^0-9]", "");
					double foo52 = Integer.parseInt(ab);
					String bob53 = aryLines[52];
					String bb = bob53.replaceAll("[^0-9]", "");
					double foo53 = Integer.parseInt(bb);
					/*String bob54 = aryLines[53];
					String cb = bob54.replaceAll("[^0-9]", "");
					double foo54 = Integer.parseInt(cb);
					*/
					String bob55 = aryLines[54];
					String db = bob55.replaceAll("[^0-9]", "");
					double foo55 = Integer.parseInt(db);
					String bob56 = aryLines[55];
					String eb = bob56.replaceAll("[^0-9]", "");
					double foo56 = Integer.parseInt(eb);
					String bob57 = aryLines[56];
					String fb = bob57.replaceAll("[^0-9]", "");
					double foo57 = Integer.parseInt(fb);
					String bob58 = aryLines[57];
					String gb = bob58.replaceAll("[^0-9]", "");
					double foo58 = Integer.parseInt(gb);
					String bob59 = aryLines[58];
					String hb = bob59.replaceAll("[^0-9]", "");
					double foo59 = Integer.parseInt(hb);
					String bob60 = aryLines[59];
					String ib = bob60.replaceAll("[^0-9]", "");
					double foo60 = Integer.parseInt(ib);
					String bob61 = aryLines[60];
					String jb = bob61.replaceAll("[^0-9]", "");
					double foo61 = Integer.parseInt(jb);
					String bob62 = aryLines[61];
					String kb = bob62.replaceAll("[^0-9]", "");
					double foo62 = Integer.parseInt(kb);
					
					String bob63 = aryLines[62];
					String lb = bob63.replaceAll("[^0-9]", "");
					double foo63 = Integer.parseInt(lb);
					String bob64 = aryLines[63];
					String mb = bob64.replaceAll("[^0-9]", "");
					double foo64 = Integer.parseInt(mb);
					String bob65 = aryLines[64];
					String nb = bob65.replaceAll("[^0-9]", "");
					double foo65 = Integer.parseInt(nb);
					String bob66 = aryLines[65];
					String ob = bob66.replaceAll("[^0-9]", "");
					double foo66 = Integer.parseInt(ob);
					/*String bob67 = aryLines[66];
					String pb = bob67.replaceAll("[^0-9]", "");
					double foo67 = Integer.parseInt(pb);
					*/
					String bob68 = aryLines[67];
					String qb = bob68.replaceAll("[^0-9]", "");
					double foo68 = Integer.parseInt(qb);
					String bob69 = aryLines[67];
					String rb = bob69.replaceAll("[^0-9]", "");
					double foo69 = Integer.parseInt(rb);
					String bob70 = aryLines[69];
					String sb = bob70.replaceAll("[^0-9]", "");
					double foo70 = Integer.parseInt(sb);
					String bob71 = aryLines[70];
					String tb = bob71.replaceAll("[^0-9]", "");
					double foo71 = Integer.parseInt(tb);
					String bob72 = aryLines[71];
					String ub = bob72.replaceAll("[^0-9]", "");
					double foo72 = Integer.parseInt(ub);
					String bob73 = aryLines[72];
					String vb = bob73.replaceAll("[^0-9]", "");
					double foo73 = Integer.parseInt(vb);
					String bob74 = aryLines[73];
					String wb = bob74.replaceAll("[^0-9]", "");
					double foo74 = Integer.parseInt(wb);
					
					String bob75 = aryLines[74];
					String xb= bob75.replaceAll("[^0-9]", "");
					double foo75 = Integer.parseInt(xb);
					String bob76 = aryLines[75];
					String yb = bob76.replaceAll("[^0-9]", "");
					double foo76 = Integer.parseInt(yb);
					String bob77 = aryLines[76];
					String zb = bob77.replaceAll("[^0-9]", "");
					double foo77 = Integer.parseInt(zb);
					String bob78 = aryLines[77];
					String ac = bob78.replaceAll("[^0-9]", "");
					double foo78 = Integer.parseInt(ac);
					/*String bob79 = aryLines[78];
					String bc = bob79.replaceAll("[^0-9]", "");
					double foo79 = Integer.parseInt(bc);
					/*String bob80 = aryLines[79];
					String cc = bob80.replaceAll("[^0-9]", "");
					double foo80 = Integer.parseInt(cc);
					
					String bob81 = aryLines[80];
					String dc = bob81.replaceAll("[^0-9]", "");
					double foo81 = Integer.parseInt(dc);
					String bob82 = aryLines[81];
					String ec = bob82.replaceAll("[^0-9]", "");
					double foo82 = Integer.parseInt(ec);
					String bob83 = aryLines[82];
					String fc = bob83.replaceAll("[^0-9]", "");
					double foo83 = Integer.parseInt(fc);
					String bob84 = aryLines[83];
					String gc = bob84.replaceAll("[^0-9]", "");
					double foo84 = Integer.parseInt(gc);
					String bob85 = aryLines[84];
					String hc = bob85.replaceAll("[^0-9]", "");
					double foo85 = Integer.parseInt(hc);
					String bob86 = aryLines[85];
					String ic = bob86.replaceAll("[^0-9]", "");
					double foo86 = Integer.parseInt(ic);
					
					String bob87 = aryLines[86];
					String jc = bob87.replaceAll("[^0-9]", "");
					double foo87 = Integer.parseInt(jc);
					String bob88 = aryLines[87];
					String kc = bob88.replaceAll("[^0-9]", "");
					double foo88 = Integer.parseInt(kc);
					String bob89 = aryLines[88];
					String lc = bob89.replaceAll("[^0-9]", "");
					double foo89 = Integer.parseInt(lc);
					String bob90 = aryLines[89];
					String mc = bob90.replaceAll("[^0-9]", "");
					double foo90 = Integer.parseInt(mc);
					String bob91 = aryLines[90];
					String nc = bob91.replaceAll("[^0-9]", "");
					double foo91 = Integer.parseInt(nc);
					String bob92 = aryLines[91];
					String oc = bob92.replaceAll("[^0-9]", "");
					double foo92 = Integer.parseInt(oc);
					/*String bob93 = aryLines[92];
					String pc = bob93.replaceAll("[^0-9]", "");
					double foo93 = Integer.parseInt(pc);
					
					String bob94 = aryLines[93];
					String qc = bob94.replaceAll("[^0-9]", "");
					double foo94 = Integer.parseInt(qc);
					String bob95 = aryLines[94];
					String rc = bob95.replaceAll("[^0-9]", "");
					double foo95 = Integer.parseInt(rc);
					String bob96 = aryLines[95];
					String sc = bob96.replaceAll("[^0-9]", "");
					double foo96 = Integer.parseInt(sc);
					String bob97 = aryLines[96];
					String tc = bob97.replaceAll("[^0-9]", "");
					double foo97 = Integer.parseInt(tc);
					String bob98 = aryLines[97];
					String uc = bob98.replaceAll("[^0-9]", "");
					double foo98 = Integer.parseInt(uc);
					
					String bob99 = aryLines[98];
					String vc = bob99.replaceAll("[^0-9]", "");
					double foo99 = Integer.parseInt(vc);
					String bob100 = aryLines[99];
					String wc = bob100.replaceAll("[^0-9]", "");
					double foo100 = Integer.parseInt(wc);
					String bob101 = aryLines[100];
					String xc = bob101.replaceAll("[^0-9]", "");
					double foo101 = Integer.parseInt(xc);
					String bob102 = aryLines[101];
					String yc = bob102.replaceAll("[^0-9]", "");
					double foo102 = Integer.parseInt(yc);
					String bob103 = aryLines[102];
					String zc = bob103.replaceAll("[^0-9]", "");
					double foo103 = Integer.parseInt(zc);
					String bob104 = aryLines[103];
					String ad = bob104.replaceAll("[^0-9]", "");
					double foo104 = Integer.parseInt(ad);
					\*
					//System.out.println(foo2 + foo3 + foo4 + foo5 + foo6 + foo7 + foo8 + foo9 + foo10 + foo11 + foo12 + foo13 + foo14);
					//System.out.println(foo3);
				/*	
					String bob4 = aryLines[3];
					String d = bob4.replaceAll("[^0-9]", "");
					int foo4 = Integer.parseInt(d);
					System.out.println(foo4);
					String bob5 = aryLines[4];
					String e = bob5.replaceAll("[^0-9]", "");
					int foo5 = Integer.parseInt(d);
					System.out.println(foo5);
					//JOptionPane.showMessageDialog(null, foo + foo2 + foo3 + foo4 + foo5);
				*/	 
					 
				//double averageTest = foo3/2 + foo2/2;
				//System.out.println(averageTest);
					
				/**	3, 16, 29, 42, 55, 68, 81, 94
				 * 
				 */
					/**
					double teleTote = foo3/6 + foo16/6 + foo29/6 + foo42/6 + foo55/6 + foo68/6;
					System.out.println(teleTote);
					double toteHeight = foo4/6 + foo17/6 +foo30/6 + foo43/6 +foo56/6 + foo69/6;
					System.out.println(toteHeight);
					double autoPoint = foo5/6 + foo18/6 + foo31/6 + foo44/6 + foo57/6 + foo70/6;
					System.out.println(autoPoint);
					double canPoint = foo6/6 + foo19/6 + foo32/6 + foo45/6 + foo58/6 + foo71/6;
					System.out.println(canPoint);
					double canHeight = foo7/6 + foo20/6 + foo33/6 + foo46/6 + foo59/6 + foo72/6;
					System.out.println(canHeight);
					double litPoint = foo8/6 + foo21/6 + foo34/6 + foo47/6 + foo60/6 + foo73/6;
					System.out.println(litPoint);
					double litHeight = foo9/6 + foo22/6 + foo35/6 + foo48/6 + foo61/6 + foo74/6;
					System.out.println(litHeight);
					double coopPoint = foo10/6 + foo23/6 + foo36/6 + foo49/6 + foo62/6 + foo75/6;
					System.out.println(coopPoint);
					double totalAverage = teleTote + autoPoint + canPoint + litPoint + coopPoint;
					*/
					
					double allianceZone = foo3/6 + foo16/6 + foo29/6 + foo42/6 + foo55/6 + foo68/6;
					System.out.println(allianceZone);
					double autoTotes = foo4/6 + foo17/6 + foo30/6 + foo43/6 + foo56/6 + foo69/6;
					System.out.println(autoTotes);
					double autoCans = foo5/6 + foo18/6 + foo31/6 + foo44/6 + foo57/6 + foo70/6;
					System.out.println(autoCans);
					double gamePieces = foo6/6 + foo19/6 + foo32/6 + foo45/6 + foo58/6 + foo71/6;
					System.out.println(gamePieces);
					double toteHeight = foo7/6 + foo20/6 + foo33/6 + foo46/6 + foo59/6 + foo72/6;
					System.out.println(toteHeight);
					double platformCans = foo8/6 + foo21/6 + foo34/6 + foo47/6 + foo60/6 + foo73/6;
					System.out.println(platformCans);
					double platformTotes = foo9/6 + foo22/6 + foo35/6 + foo48/6 + foo61/6 + foo74/6;
					System.out.println(platformTotes);
					double maxHeight = foo10/6 + foo23/6 + foo36/6 + foo49/6 + foo62/6 + foo76/6;
					System.out.println(maxHeight);
					double platformCansAndTotes = foo11/8 + foo24/8 + foo37/8 + foo50/8 + foo63/8 + foo77/8;
					System.out.println(platformCansAndTotes);
					double litterInCan = foo12/8 + foo25/8 + foo38/8 + foo51/8 + foo64/8 + foo78/8;
					System.out.println(allianceZone);
				//	TODO Alter Printer
					
					
					
					FileWriter fStream = new FileWriter("Compiled.txt", true);
					fStream.append(System.getProperty("line.separator"));
					fStream.append(System.getProperty("line.separator"));
					fStream.append(Com + "        " + allianceZone + "            " + autoTotes + "                  " + autoCans + "               " + gamePieces + "                " + toteHeight + "                 " + platformCans + "             " + platformTotes + "              " + maxHeight + "              " + platformCansAndTotes + "          " + litterInCan);
					fStream.append(System.getProperty("line.separator"));
					fStream.append(System.getProperty("line.separator"));
				//	fStream.append("          Total Average Points: " + totalAverage);
					fStream.append(System.getProperty("line.separator"));
					
					
					/*
					fStream.append("Team Number:" + Com);
					fStream.append(System.getProperty("line.separator"));
					fStream.append(System.getProperty("line.separator"));
					fStream.append("Average tote points:           " + teleTote);
					fStream.append(System.getProperty("line.separator"));
					fStream.append("____________________________________");
					fStream.append(System.getProperty("line.separator"));
					fStream.append("Average highest tote:          " + toteHeight);
					fStream.append(System.getProperty("line.separator"));
					fStream.append("____________________________________");
					fStream.append(System.getProperty("line.separator"));
					fStream.append("Average Autonomous Total:      " + autoPoint );
					fStream.append(System.getProperty("line.separator"));
					fStream.append("____________________________________");
					fStream.append(System.getProperty("line.separator"));
					fStream.append("Average Can Points:            " + canPoint);
					fStream.append(System.getProperty("line.separator"));
					fStream.append("____________________________________");
					fStream.append(System.getProperty("line.separator"));
					fStream.append("Average Highest Can:           " + canHeight);
					fStream.append(System.getProperty("line.separator"));
					fStream.append("____________________________________");
					fStream.append(System.getProperty("line.separator"));
					fStream.append("Average Litter Points:         " + litPoint);
					fStream.append(System.getProperty("line.separator"));
					fStream.append("____________________________________");
					fStream.append(System.getProperty("line.separator"));
					fStream.append("Average Litter Height:         " + litHeight);
					fStream.append(System.getProperty("line.separator"));
					fStream.append("____________________________________");
					fStream.append(System.getProperty("line.separator"));
					fStream.append("Average CoOp Points:           " + coopPoint);
					fStream.append(System.getProperty("line.separator"));
					fStream.append(System.getProperty("line.separator"));
					fStream.append(System.getProperty("line.separator"));
					fStream.append(System.getProperty("line.separator"));
					*/
					fStream.flush();
					fStream.close();
				}
			
		
				catch (IOException e){
					System.out.println( e.getMessage());
					
				
	
				}
		}
	}		
}