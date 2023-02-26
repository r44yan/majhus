import java.util.Scanner;
import java.util.ArrayList;

public class CrimeReport {
   public static void main(String[] args) {
      System.out.println("All of the statistics in this program are sourced from the SF Police Department and from January 2022 to current date");
      CrimeData sanFrancisco = new CrimeData();
      sanFrancisco.userCity();
   }
}

class Data {
  private String districtName;
  private int homicide;
  private int rape;
  private int robbery;
  private int assault;
  private int sexTrafficking;
  private int invServTrafficking;
  private int burglary;
  private int vehicle;
  private int arson;
  private int larceny;
  
  public Data (String districtName, int homicide, int rape, int robbery, int assault, int sexTrafficking, int burglary, int vehicle, int arson, int larceny) {
    this.districtName = districtName;
    this.homicide = homicide;
    this.rape = rape;
    this.robbery = robbery;
    this.assault = assault;
    this.sexTrafficking = sexTrafficking;
    this.invServTrafficking = invServTrafficking;
    this.burglary = burglary;
    this.vehicle = vehicle;
    this.arson = arson;
    this.larceny = larceny;
  }  
  
   public String getName() {
      return districtName;
   } 
  
   public int getHomicideCount() {
      return homicide;
   }
  
   public int getRapeCount() {
      return rape;
   }
   
   public int getRobberyCount() {
      return robbery;
   }
   
   public int getAssaultCount() {
      return assault;
   }
   
   public int getTraffickingCount() {
      return sexTrafficking;
   }
   
   public int getBurglaryCount() {
      return burglary;
   }
   
   public int getVehicleCount() {
      return vehicle;
   }
   
   public int getArsonCount() {
      return arson;
   }
   
   public int getLarcenyCount() {
      return larceny;
   }
}

class CrimeData {
   private Data[][] areas;
   private Data[] districts;
   private Data bayview;
   private Data central;
   private Data ingleside;
   private Data mission;
   private Data northern;
   private Data park;
   private Data richmond;
   private Data southern;
   private Data taraval;
   private Data tenderloin;
   private Scanner scan = new Scanner(System.in);

  
   public CrimeData() {
      bayview = new Data("Bayview", 19, 25, 271, 407, 1, 612, 179, 47, 1778);
      central = new Data("Central", 1, 29, 372, 256, 2, 848, 510, 47, 9486);
      ingleside = new Data("Ingleside", 9, 25, 273, 269, 0, 637, 1129, 30, 2152);
      mission = new Data("Mission", 10, 34, 452, 436, 3, 849, 1039, 43, 3729);
      northern = new Data("Northern", 8, 36, 336, 327, 1, 1136, 748, 67, 6978);
      park = new Data("Park", 2, 14, 61, 70, 0, 477, 372, 8, 1905);
      richmond = new Data("Richmond", 1, 11, 112, 93, 0, 490, 399, 11, 3769);
      southern = new Data("Southern", 3, 44, 308, 379, 3, 854, 648, 45, 4211);
      taraval = new Data("Taraval", 3, 11, 152, 124, 1, 639, 695, 18, 3897);
      tenderloin = new Data("Tenderloin", 8, 39, 386, 541, 3, 254, 249, 27, 1943);
      districts = new Data[] {bayview, central, ingleside, mission, northern, park, richmond, southern, taraval, tenderloin};
      areas = new Data[][] { {bayview}, {central}, {ingleside}, {mission}, {northern}, {park}, {richmond}, {southern}, {taraval}, {tenderloin} };
   }
  
  
     
   public void userCity() {
      System.out.println("What district in the city are you visiting? The options are: ");
      int numRegions = districts.length;
      for (int i = 0; i < numRegions - 1; i++) {
         System.out.print(districts[i].getName() + ", ");
      }
      System.out.print(districts[numRegions - 1].getName()); // print last district with no comma
      System.out.println();
      System.out.println("");
      String answer = scan.next();
      for (int i = 0; i < areas.length; i++) {
        for (int j = 0; j < areas[i].length; j++) {
            if (areas[i][j].getName().toLowerCase().equals(answer.toLowerCase())) {
                if (areas[i][j].getName().equals("Bayview")) {
                    System.out.println("Crime data for Bayview:");
                    System.out.println("Homicide: " + bayview.getHomicideCount());
                    System.out.println("Rape: " + bayview.getRapeCount());
                    System.out.println("Robbery: " + bayview.getRobberyCount());
                    System.out.println("Assault: " + bayview.getAssaultCount());
                    System.out.println("Human Sex Trafficking: " + bayview.getTraffickingCount());
                    System.out.println("Burglary: " + bayview.getBurglaryCount());
                    System.out.println("Vehicle theft: " + bayview.getVehicleCount());
                    System.out.println("Arson: " + bayview.getArsonCount());
                    System.out.println("Larceny: " + bayview.getLarcenyCount());
                    return;
                } else if (areas[i][j].getName().equals("Central")) {
                    System.out.println("Crime data for Central:");
                    System.out.println("Homicide: " + central.getHomicideCount());
                    System.out.println("Rape: " + central.getRapeCount());
                    System.out.println("Robbery: " + central.getRobberyCount());
                    System.out.println("Assault: " + central.getAssaultCount());
                    System.out.println("Human Sex Trafficking: " + central.getTraffickingCount());
                    System.out.println("Burglary: " + central.getBurglaryCount());
                    System.out.println("Vehicle theft: " + central.getVehicleCount());
                    System.out.println("Arson: " + central.getArsonCount());
                    System.out.println("Larceny: " + central.getLarcenyCount());
                    return;
                } else if (areas[i][j].getName().equals("Mission")) {
                    System.out.println("Crime data for Mission:");
                    System.out.println("Homicide: " + mission.getHomicideCount());
                    System.out.println("Rape: " + mission.getRapeCount());
                    System.out.println("Robbery: " + mission.getRobberyCount());
                    System.out.println("Assault: " + mission.getAssaultCount());
                    System.out.println("Human Sex Trafficking: " + mission.getTraffickingCount());
                    System.out.println("Burglary: " + mission.getBurglaryCount());
                    System.out.println("Vehicle theft: " + mission.getVehicleCount());
                    System.out.println("Arson: " + mission.getArsonCount());
                    System.out.println("Larceny: " + mission.getLarcenyCount());
                    return;
                } else if (areas[i][j].getName().equals("Northern")) {
                    System.out.println("Crime data for Northern:");
                    System.out.println("Homicide: " + northern.getHomicideCount());
                    System.out.println("Rape: " + northern.getRapeCount());
                    System.out.println("Robbery: " + northern.getRobberyCount());
                    System.out.println("Assault: " + northern.getAssaultCount());
                    System.out.println("Human Sex Trafficking: " + northern.getTraffickingCount());
                    System.out.println("Burglary: " + northern.getBurglaryCount());
                    System.out.println("Vehicle theft: " + northern.getVehicleCount());
                    System.out.println("Arson: " + northern.getArsonCount());
                    System.out.println("Larceny: " + northern.getLarcenyCount());
                    return;
                } else if (areas[i][j].getName().equals("Park")) {
                    System.out.println("Crime data for Park:");
                    System.out.println("Homicide: " + park.getHomicideCount());
                    System.out.println("Rape: " + park.getRapeCount());
                    System.out.println("Robbery: " + park.getRobberyCount());
                    System.out.println("Assault: " + park.getAssaultCount());
                    System.out.println("Human Sex Trafficking: " + park.getTraffickingCount());
                    System.out.println("Burglary: " + park.getBurglaryCount());
                    System.out.println("Vehicle theft: " + park.getVehicleCount());
                    System.out.println("Arson: " + park.getArsonCount());
                    System.out.println("Larceny: " + park.getLarcenyCount());
                    return;
                }  else if (areas[i][j].getName().equals("Richmond")) {
                    System.out.println("Crime data for Richmond:");
                    System.out.println("Rape: " + richmond.getRapeCount());
                    System.out.println("Robbery: " + richmond.getRobberyCount());
                    System.out.println("Assault: " + richmond.getAssaultCount());
                    System.out.println("Human Sex Trafficking: " + richmond.getTraffickingCount());
                    System.out.println("Burglary: " + richmond.getBurglaryCount());
                    System.out.println("Vehicle theft: " + richmond.getVehicleCount());
                    System.out.println("Arson: " + richmond.getArsonCount());
                    System.out.println("Larceny: " + richmond.getLarcenyCount());
                    return;
                }  else if (areas[i][j].getName().equals("Southern")) {
                    System.out.println("Crime data for Southern:");
                    System.out.println("Rape: " + southern.getRapeCount());
                    System.out.println("Robbery: " + southern.getRobberyCount());
                    System.out.println("Assault: " + southern.getAssaultCount());
                    System.out.println("Human Sex Trafficking: " + southern.getTraffickingCount());
                    System.out.println("Burglary: " + southern.getBurglaryCount());
                    System.out.println("Vehicle theft: " + southern.getVehicleCount());
                    System.out.println("Arson: " + southern.getArsonCount());
                    System.out.println("Larceny: " + southern.getLarcenyCount());
                    return;
                }  else if (areas[i][j].getName().equals("Taraval")) {
                    System.out.println("Crime data for Taraval:");
                    System.out.println("Rape: " + taraval.getRapeCount());
                    System.out.println("Robbery: " + taraval.getRobberyCount());
                    System.out.println("Assault: " + taraval.getAssaultCount());
                    System.out.println("Human Sex Trafficking: " + taraval.getTraffickingCount());
                    System.out.println("Burglary: " + taraval.getBurglaryCount());
                    System.out.println("Vehicle theft: " + taraval.getVehicleCount());
                    System.out.println("Arson: " + taraval.getArsonCount());
                    System.out.println("Larceny: " + taraval.getLarcenyCount());
                    return;
                }  else if (areas[i][j].getName().equals("Tenderloin")) {
                    System.out.println("Crime data for Tenderloin:");
                    System.out.println("Rape: " + tenderloin.getRapeCount());
                    System.out.println("Robbery: " + tenderloin.getRobberyCount());
                    System.out.println("Assault: " + tenderloin.getAssaultCount());
                    System.out.println("Human Sex Trafficking: " + tenderloin.getTraffickingCount());
                    System.out.println("Burglary: " + tenderloin.getBurglaryCount());
                    System.out.println("Vehicle theft: " + tenderloin.getVehicleCount());
                    System.out.println("Arson: " + tenderloin.getArsonCount());
                    System.out.println("Larceny: " + tenderloin.getLarcenyCount());
                    return;
                }  
            }
         }
      } 
   }
}
