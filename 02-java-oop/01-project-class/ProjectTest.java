class ProjectTest{
    public static void main(String[] args){

        Project pj = new Project();
        pj.setName("pj1");
        System.out.println("Project Name: " + pj.getName());
        pj.setDescription("This is the pj1");
        System.out.println("Project Description: " + pj.getDescription());
        pj.setInitialCost(10.0);
        System.out.println("Initial Cost: " + pj.getInitialCost());


        Project pj2 = new Project("pj2");
        System.out.println("Project Name: " + pj2.getName());
        pj2.setDescription("This is the pj2");
        System.out.println("Project Description: " + pj2.getDescription());
        pj2.setInitialCost(20.0);
        System.out.println("Initial Cost: " + pj2.getInitialCost());

        Project pj3 = new Project("pj3", "This is the pj3");
        System.out.println("Project Name: " + pj3.getName());
        System.out.println("Project Description: " + pj3.getDescription());
        pj3.setInitialCost(30.0);
        System.out.println("Initial Cost: " + pj3.getInitialCost());


        System.out.println(pj3.elevatorPitch());


        Portfolio pf = new Portfolio();
        pf.setPorfolioProject(pj3);
    }
}