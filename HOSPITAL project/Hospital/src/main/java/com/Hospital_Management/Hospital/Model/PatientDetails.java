package com.Hospital_Management.Hospital.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "PatientDetails")
public class PatientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String studentName;
    private String studentRollNum;
    private long studentPhNum; // changed to long to accommodate 10-digit phone numbers
    private String studentHostel;
    private int studentRoomNum;
    private String parentName;
    private long parentNum; // changed to long to accommodate 10-digit phone numbers
    private String reason;

    public PatientDetails() {
    }

    public PatientDetails(String studentName, String studentRollNum, long studentPhNum, String studentHostel, int studentRoomNum, String parentName, long parentNum, String reason) {
        this.studentName = studentName;
        this.studentRollNum = studentRollNum;
        this.studentPhNum = studentPhNum;
        this.studentHostel = studentHostel;
        this.studentRoomNum = studentRoomNum;
        this.parentName = parentName;
        this.parentNum = parentNum;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollNum() {
        return studentRollNum;
    }

    public void setStudentRollNum(String studentRollNum) {
        this.studentRollNum = studentRollNum;
    }

    public long getStudentPhNum() {
        return studentPhNum;
    }

    public void setStudentPhNum(long studentPhNum) {
        this.studentPhNum = studentPhNum;
    }

    public String getStudentHostel() {
        return studentHostel;
    }

    public void setStudentHostel(String studentHostel) {
        this.studentHostel = studentHostel;
    }

    public int getStudentRoomNum() {
        return studentRoomNum;
    }

    public void setStudentRoomNum(int studentRoomNum) {
        this.studentRoomNum = studentRoomNum;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public long getParentNum() {
        return parentNum;
    }

    public void setParentNum(long parentNum) {
        this.parentNum = parentNum;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "PatientDetails{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentRollNum='" + studentRollNum + '\'' +
                ", studentPhNum=" + studentPhNum +
                ", studentHostel='" + studentHostel + '\'' +
                ", studentRoomNum=" + studentRoomNum +
                ", parentName='" + parentName + '\'' +
                ", parentNum=" + parentNum +
                ", reason='" + reason + '\'' +
                '}';
    }
}