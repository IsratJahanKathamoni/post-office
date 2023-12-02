/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class Add_employee {
    public class addemp {
    String name;
    String employeeid;
    String salery;
 String joiningdate;
        @Override
        public String toString() {
            return "addemp{" + "name=" + name + ", employeeid=" + employeeid + ", salery=" + salery + ", joiningdate=" + joiningdate + '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmployeeid(String employeeid) {
            this.employeeid = employeeid;
        }

        public void setSalery(String salery) {
            this.salery = salery;
        }

        public void setJoiningdate(String joiningdate) {
            this.joiningdate = joiningdate;
        }

        public String getName() {
            return name;
        }

        public String getEmployeeid() {
            return employeeid;
        }

        public String getSalery() {
            return salery;
        }

        public String getJoiningdate() {
            return joiningdate;
        }

        public addemp(String name, String employeeid, String salery, String joiningdate) {
            this.name = name;
            this.employeeid = employeeid;
            this.salery = salery;
            this.joiningdate = joiningdate;
        }
  
    

    }}