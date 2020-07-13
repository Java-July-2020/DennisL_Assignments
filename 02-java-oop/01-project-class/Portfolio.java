class Portfolio{
    private ArrayList<Project> projects;
    private String portfolioName;

    public void setPorfolioProject(Project project){
        projects.add(project);
    }

    public String getPorfolioProject(){
        for (int i = 0; i < projects.size(); i++){
            System.out.println(projects.get(i));
        }
    }
}