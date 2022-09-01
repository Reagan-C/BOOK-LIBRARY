public abstract class AbstractBaseEntity {
    private  int id;
    private String name;
    private  String gender;
    private Role role;
    private  int rank;


    public AbstractBaseEntity(String name, int id, String gender, Role role) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.role = role;
        if (this.getRole().equals(Role.TEACHER)) {
            rank = 1;
        }else if (this.getRole().equals(Role.SENIOR_STUDENT)) {
            rank = 2;
        } else if (this.getRole().equals(Role.JUNIOR_STUDENT)) {
            rank = 3;
        }
    }
    public AbstractBaseEntity() {
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                ", role=" + role +
                '}';
    }
}
