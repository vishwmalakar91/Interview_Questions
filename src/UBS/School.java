package UBS;

import java.util.HashMap;
import java.util.Map;

public class School {

    public Map<String, String> studentDetails = new HashMap<>();
    public Map<String, Map<String, String>> studentData = new HashMap<>();
    public Map<String, Map<String, Map<String, String>>> schoolData = new HashMap<>();

    public void setStudentData(String classNumber, String rollId, String studentIdentifier, String studentIdentifierValue) {
        studentDetails.put(studentIdentifier, studentIdentifierValue);
        studentData.put(rollId, studentDetails);
        schoolData.put(classNumber, studentData);
    }

    public Map<String, String> getStudentDetails(String classNumber, String rollId) {
        Map<String, String> studentDetails;
        studentDetails = schoolData.get(classNumber).get(rollId);
        return studentDetails;
    }

    public static void main(String[] args) {
        School s = new School();
        s.setStudentData("1", "1", "name", "A");
        s.setStudentData("1", "2", "name", "B");
        s.setStudentData("2", "10", "name", "X");
        s.setStudentData("3", "11", "name", "Y");

        System.out.println(s.getStudentDetails("1", "1"));
    }
}
