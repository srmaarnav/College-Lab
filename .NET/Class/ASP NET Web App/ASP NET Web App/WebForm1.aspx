<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="ASP_NET_Web_App.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <table>
                <tr>
                    <td>Name</td>
                    <td>
                        <asp:TextBox ID="name" runat="server" OnTextChanged="name_TextChanged"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>
                        <asp:TextBox ID="email" runat="server"></asp:TextBox>

                    </td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>
                        <asp:TextBox ID="address" runat="server"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <asp:RadioButton ID="radiomale" name="gender" text="Male" runat="server" />
                        <asp:RadioButton ID="radiofemale" name="gender" text="Female" runat="server" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Save
                    </td>
                    <td>
                        <asp:Button ID="save" runat="server" Text="Save" />
                    </td>
                </tr>
            </table>

        </div>
    </form>
</body>
</html>
