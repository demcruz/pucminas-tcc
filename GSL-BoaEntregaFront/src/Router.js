import React from "react";
import { Route, Switch, BrowserRouter } from "react-router-dom";
import Login from "./pages/Login/Login";
import Acompanhamento from "./pages/Acompanhamento/Acompanhamento";
import PrivateRoute from "./routes/privateRoute";
import Layout from "./layout/Layout";
import Perfil from "./pages/Perfil/Perfil";
import Historico from "./pages/Historico/Historico"
import NovoPedido from "./pages/NovoPedido/NovoPedido"
import ExtratoeNotas from "./pages/ExtratosNotas/ExtratosNotas"

import Cadastro from "./pages/Cadastro/Cadastro";

const Router = () => {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/gsl" component={Login} />
        <Route path="/gsl/Cadastro" component={Cadastro} />
        <Layout>
          <PrivateRoute path="/gsl/novoPedido" component={NovoPedido} />
          <PrivateRoute path="/gsl/acompanhamento" component={Acompanhamento} />
          <PrivateRoute path="/gsl/historico" component={Historico} />
          <PrivateRoute path="/gsl/extratoeNotas" component={ExtratoeNotas} />

          <PrivateRoute path="/gsl/perfil" component={Perfil} />
          

        </Layout>
      </Switch>
    </BrowserRouter>
  );
};

export default Router;
