class ProjectTest{
    public static void main(String[] args){

        Project pj = new Project();
        pj.setName("pj1");
        System.out.println("Project Name" + pj.getName());
        pj.setDescription("This is the pj1");
        System.out.println("Project Description" + pj.getDescription());


        Project pj2 = new Project("pj2");
        System.out.println("Project Name" + pj2.getName());
        pj2.setDescription("This is the pj2");
        System.out.println("Project Description" + pj2.getDescription());

        Project pj3 = new Project("pj3", "This is the pj3");
        System.out.println("Project Name" + pj3.getName());
        System.out.println("Project Description" + pj3.getDescription());


        System.out.println(pj3.elevatorPitch());

    }
}