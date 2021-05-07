import DashBoard from "pages/dashBord";
import Home from "pages/home";
import { BrowserRouter, Route, Switch } from "react-router-dom";

function Routes () {
    return (
        <BrowserRouter>
        <Switch>
            <Route path="/" exact>
                <Home/>
            </Route>
            <Route path="/dashborad" >
                <DashBoard/>
            </Route>
        </Switch>
        </BrowserRouter>
    )
}

export default Routes;