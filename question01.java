public class commandline {
        public static void main(String[] args) {
            if(args.length < 4){
                System.out.println("Please provide all the required argumnets: Name, University Roll Number, Course, Semester");
                
                return;
            }
            String name = args[0];
            int UniversityRollNo = Integer.parseInt(args[1]);
            String Course = args[2];
            int Semester = Integer.parseInt(args[3]);
        
    
            System.out.println("Name" + "name");
        }
        
    }