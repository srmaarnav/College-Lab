namespace MVC_Core.Services
{
    public interface ILog
    {
        void Info(string Message);
    }
    public class Temp:ILog
    {
        public void Info(string Message) { }
    }
}
