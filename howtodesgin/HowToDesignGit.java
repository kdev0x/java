class Git{
    private String workingTree;
    private String stage;
    private String repository;
    private int commitId;

    public Git(){
        this.workingTree = "";
        this.stage = "";
        this.repository = "";
        this.commitId = 1;
    }

    public void setWorkingTree(String wt){
        this.workingTree = wt;
    }

    public boolean add(){
        if(this.workingTree.length() == 0){
            return false;
        }

        this.stage = this.workingTree;
        return true;
    }
    
    public boolean restore(){
        if(this.stage.length() == 0){
            return false;
        }
        
        this.stage = "";
        return true;
    }

    public boolean commit(String meassege){
        if(this.stage.length() == 0){
            return false;
        }

        this.repository = this.repository + this.commitId + " -> " + meassege + ':' + this.stage + "\n";
        this.commitId++;
        this.workingTree = "";
        this.stage = "";

        return true;
    }

    public void status(){
        if(this.workingTree.length() == 0){
            /*CLEAN*/
            System.out.println("git: working tree is CLEAN");
        }else{/*DIRTY*/
            if(this.stage.length() == 0){
                /*ADD*/
                System.out.println("git: you have somthing to ADD");
            }else{
                /*COMMIT*/
                System.out.println("git: you have somthing to COMMIT");
            }
        }
    }

    public void log(){
        if(this.repository.length() == 0){
            System.out.println("Empty repository");
        }else{
            System.out.println("------------------------------------------------");
            System.out.println(repository);
            System.out.println("------------------------------------------------");

        }
    }
    
}

public class HowToDesign{
    public static void main(String[] args) {
       Git git = new Git();
       git.status();
       git.setWorkingTree("gitman.md");
       git.status();
       git.add();
       git.status();
       git.commit("gitman file added");
       git.status();

       git.setWorkingTree("javaman.java");
       git.status();
       git.add();
       git.status();
       git.commit("javaman file added");
       git.status();

       git.log();
    }

}
