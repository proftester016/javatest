class EmployeeWithSuperDemoClass {
//Answer is A ,c and d   System.out.println("Maximum speed: "+super.empid)
    //System.out.println("Maximum speed: "+ new Employee().empid)
      //System.out.println("Maximum speed: "+ Employee.empid)

        static final int empid = 1101;
    }



    class Unit extends Employee {
        int empid = 1102;
        public void display() {
            //Line7

        }
    }

     class SuperDemo {
        public static void main(String[] args) {
            Unit unit = new Unit();
            unit.display();
        }
    }
