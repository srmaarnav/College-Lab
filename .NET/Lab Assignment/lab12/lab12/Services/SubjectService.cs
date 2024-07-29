namespace lab12.Services
{
    public interface ISubjectService
    {
        string GetRoutine();
    }
    public class SubjectService: ISubjectService
    {
        public string GetRoutine()
        {
            return "The classes today are: CDC, .NET and E-Commerce.";
        }
    }
}
