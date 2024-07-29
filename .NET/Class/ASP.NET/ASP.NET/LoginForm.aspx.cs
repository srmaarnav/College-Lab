using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ASP.NET
{
    public partial class LoginForm : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if(!IsPostBack)
            {
                // for first time visit, we need to focus on username that is the id of username in the form
                username.Focus();
            }
        }
        protected void btnreset_Click(object sender, EventArgs e)
        {
            username.Text = email.Text = password.Text = "";
        }

        protected void btnlogin_Click(object sender, EventArgs e)
        {
            if(username.Text=="apple" &&  password.Text=="apple" && email.Text=="a@a.com")
            {
                lblstatus.Text = "Valid User";
            }
            else
            {
                lblstatus.Text = "Invalid User";
            }
        }
    }
}