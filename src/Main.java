import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dim = "Account" ;//args[0];
        String cube = "EPBCS";//args[1];
        File f = new File("config.txt");
        List<String> l = new ArrayList<String>();
        Scanner in = null;
        System.out.println("Start time = "+ LocalDateTime.now());
        try {
            in = new Scanner(f);
            while (in.hasNextLine()) {
                l.add(in.nextLine());
            }
            in.close();
            String dbUrl = l.get(0).substring(l.get(0).lastIndexOf("|")+ 1);
            String dbUserName = l.get(1).substring(l.get(1).lastIndexOf("|")+ 1);
            String dbPassword = l.get(2).substring(l.get(2).lastIndexOf("|")+ 1);
            String serverUrl = l.get(3).substring(l.get(3).lastIndexOf("|")+ 1);
            String ServerUserName = l.get(4).substring(l.get(4).lastIndexOf("|")+ 1);
            String ServerPassword = l.get(5).substring(l.get(5).lastIndexOf("|")+ 1);
            String path = l.get(6).substring(l.get(6).lastIndexOf("|")+1);
            String dflt_Entity= l.get(7).substring(l.get(7).lastIndexOf("|")+1);
            String dflt_Period  = l.get(8).substring(l.get(8).lastIndexOf("|")+1);
            String dflt_Product= l.get(9).substring(l.get(9).lastIndexOf("|")+1);
            String dflt_Scenario= l.get(10).substring(l.get(10).lastIndexOf("|")+1);
            String dflt_Version= l.get(11).substring(l.get(11).lastIndexOf("|")+1);
            String dflt_Year= l.get(12).substring(l.get(12).lastIndexOf("|")+1);
            String dflt_PlanElmnt= l.get(12).substring(l.get(13).lastIndexOf("|")+1);
            String dflt_Market= l.get(12).substring(l.get(14).lastIndexOf("|")+1);
            String dflt_Currency= l.get(12).substring(l.get(15).lastIndexOf("|")+1);
            //System.out.println(serverUrl+" ,"+userName+" ,"+password+" ,"+ path);
            //System.out.println(dflt_Entity+", "+dflt_Period+", "+dflt_Product+", "+dflt_Scenario+", "+dflt_Version+", "+dflt_Year);
            //infinityDbProcs.CreateMetadata.createFile(dbUrl,dbUserName,dbPassword,dim,cube);
            //infinityDbProcs.GetMetadataCSV.getDimension(dbUrl,dbUserName,dbPassword,dim,cube,path,dim+".csv");
            //infinityDbProcs.UploadFile.uploadFile(serverUrl,ServerUserName,ServerPassword,"Import"+dim+".csv");
            //infinityDbProcs.OracleEPMCloudHelper.executeJob(serverUrl,ServerUserName,ServerPassword,"IMPORT_METADATA", "InfinityAccountImport", "{errorFile:InfinityAccountImportError.zip}");
            //infinityDbProcs.OracleEPMCloudHelper.executeJob(serverUrl,ServerUserName,ServerPassword,"CUBE_REFRESH", "RefreshDatabase",    "{allowedUsersDuringCubeRefresh:All Users, terminateActiveRequestsBeforeCubeRefresh:false,logOffAllUsersBeforeCubeRefresh:true,allowedUsersAfterCubeRefresh:Administrators}");
            infinityDbProcs.InsertMetaData.insertMetaData(dbUrl,dbUserName,dbPassword,"OA_PLAN_STG","EPM1_"+dim.toUpperCase(),"OA_PLAN_ODS","S_"+dim.toUpperCase(),null);
            infinityDbProcs.InsertMetaData.insertMetaData(dbUrl,dbUserName,dbPassword,"OA_PLAN_STG","EPM1_"+dim.toUpperCase(),"OA_PLAN_ODS","H_"+dim.toUpperCase(),null);
            infinityDbProcs.InsertMetaData.insertMetaData(dbUrl,dbUserName,dbPassword,"OA_PLAN_STG","EPM1_"+dim.toUpperCase(),"OA_PLAN_ODS","HAL_"+dim.toUpperCase(),null);
            //infinityDbProcs.DeleteFile.deletefile(serverUrl,ServerUserName,ServerPassword,"Import"+dim+".csv");
            //infinityDbProcs.GetDataCSV.getData(dbUrl,dbUserName,dbPassword,path,"Data.csv",dflt_PlanElmnt,dflt_Market,dflt_Currency,dflt_Entity,dflt_Period,dflt_Product,dflt_Scenario,dflt_Version, dflt_Year);
            //infinityDbProcs.InsertData.insertData(dbUrl,dbUserName,dbPassword,"OA_PLAN_STG","EPM1_PLANNING","OA_PLAN_ODS","L_EPM_DATA",null);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Start time = "+ LocalDateTime.now());
    }

}