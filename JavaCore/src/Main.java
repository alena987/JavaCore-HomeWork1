public class Main {

    public static void main(String[] args) {
        Team dreamTeam = new Team("Dreamteam",
                new TeamMember("A", 4),
                new TeamMember("B", 5),
                new TeamMember("C", 6),
                new TeamMember("D" ,7));

        Course course = new Course(new Cross(5), new Swimming(5), new Fight(6));
        course.doIt(dreamTeam);

    }
}
