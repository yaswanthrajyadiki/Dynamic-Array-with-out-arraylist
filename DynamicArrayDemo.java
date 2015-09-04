import java.util.Scanner;

class DynamicArrayDemo {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	String command = sc.nextLine();
  	if (command.equalsIgnoreCase("I")) {
      	DynamicArray<Integer> da = new DynamicArray<Integer>();
  		command = sc.nextLine();
  		while(!command.equals("end")) {
  			String splitC[] = command.split(" ");
  			if (splitC[0].equalsIgnoreCase("add")) {
  				da.add(Integer.parseInt(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("removeIndex")) {
  				da.removeIndex(Integer.parseInt(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("removeElement")) {
  				da.removeElement(Integer.parseInt(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("modifyIndex")) {
  				da.modifyIndex(Integer.parseInt(splitC[1]), Integer.parseInt(splitC[2]));
  			} else if (splitC[0].equalsIgnoreCase("modifyElement")) {
  				da.modifyElement(Integer.parseInt(splitC[1]), Integer.parseInt(splitC[2]));
  			} else if (splitC[0].equalsIgnoreCase("read")) {
  				da.read(Integer.parseInt(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("print")) {
  				da.print();
  			}
  			command = sc.nextLine();
  		}
  	} else if (command.equalsIgnoreCase("C")) {
  		DynamicArray<Character> da1 = new DynamicArray<Character>();
  		command = sc.nextLine();
  		while(!command.equals("end")) {
  			String splitC[] = command.split(" ");
  			if (splitC[0].equalsIgnoreCase("add")) {
  				da1.add(splitC[1].charAt(0));
  			} else if (splitC[0].equalsIgnoreCase("removeIndex")) {
  				da1.removeIndex(Integer.parseInt(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("removeElement")) {
  				da1.removeElement(splitC[1].charAt(0));
  			} else if (splitC[0].equalsIgnoreCase("modifyIndex")) {
  				da1.modifyIndex(Integer.parseInt(splitC[1]), splitC[2].charAt(0));
  			} else if (splitC[0].equalsIgnoreCase("modifyElement")) {
  				da1.modifyElement(splitC[2].charAt(0), splitC[2].charAt(0));
  			} else if (splitC[0].equalsIgnoreCase("read")) {
  				da1.read(Integer.parseInt(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("print")) {
  				da1.print();
  			}
  			command = sc.nextLine();
  		}
  	} else if (command.equalsIgnoreCase("S")) {
  		DynamicArray<String> da2 = new DynamicArray<String>();
  		command = sc.nextLine();
  		while(!command.equals("end")) {
  			String splitC[] = command.split(" ");
  			if (splitC[0].equalsIgnoreCase("add")) {
  				da2.add(splitC[1]);
  			} else if (splitC[0].equalsIgnoreCase("removeIndex")) {
  				da2.removeIndex(Integer.parseInt(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("removeElement")) {
  				da2.removeElement(splitC[1]);
  			} else if (splitC[0].equalsIgnoreCase("modifyIndex")) {
  				da2.modifyIndex(Integer.parseInt(splitC[1]), splitC[2]);
  			} else if (splitC[0].equalsIgnoreCase("modifyElement")) {
  				da2.modifyElement(splitC[2], splitC[2]);
  			} else if (splitC[0].equalsIgnoreCase("read")) {
  				da2.read(Integer.parseInt(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("print")) {
  				da2.print();
  			}
  			command = sc.nextLine();
  		}
  	} else if (command.equalsIgnoreCase("D")) {
  		DynamicArray<Double> da3 = new DynamicArray<Double>();
  		command = sc.nextLine();
  		while(!command.equals("end")) {
  			String splitC[] = command.split(" ");
  			if (splitC[0].equalsIgnoreCase("add")) {
  				da3.add(Double.parseDouble(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("removeIndex")) {
  				da3.removeIndex(Integer.parseInt(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("removeElement")) {
  				da3.removeElement(Double.parseDouble(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("modifyIndex")) {
  				da3.modifyIndex(Integer.parseInt(splitC[1]),
  					Double.parseDouble(splitC[2]));
  			} else if (splitC[0].equalsIgnoreCase("modifyElement")) {
  				da3.modifyElement(Double.parseDouble(splitC[2]),
  					Double.parseDouble(splitC[2]));
  			} else if (splitC[0].equalsIgnoreCase("read")) {
  				da3.read(Integer.parseInt(splitC[1]));
  			} else if (splitC[0].equalsIgnoreCase("print")) {
  				da3.print();
  			}
  			command = sc.nextLine();
  		}
  	}
  //   DynamicArray<Integer> da = new DynamicArray<Integer>();
  //   da.add(1);
  //   da.add(2);
  //   da.add(3);
  //   da.add(4);
  //   da.add(3);
  //   da.add(5);
  //   da.add(6); 
  //   da.removeIndex(5);
  //   da.read(5);
  //   da.modifyElement(3,4);
  //   da.modifyIndex(5,5); 
  //   da.print();
  }
}