import React, { useState } from "react";
import { useHistory } from "react-router-dom";
import api from "../../service/api";
import { Link } from "react-router-dom";
import "./login.css";
import tranportadora from "../../assets/image/transportadora.png";

import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

const Login = () => {
  const history = useHistory();
  const [username, setUsername] = useState();
  const [password, setPassword] = useState();

  function handleLogin(e) {
    e.preventDefault();

    const loginData = {
      userName: username,
      password: password,
    };
    try {
      api.post("/login", loginData, {
          headers: {
            "Content-Type": "application/json",
            "Access-Control-Allow-Origin": "*",
          },
        })
        .then((response) => {
          localStorage.setItem("@tokenApp", response.data.password);
          localStorage.setItem("@userName", response.data.userName);

          localStorage.setItem("@menuApp", response.data.permissions[0].id);
          history.replace("/gsl/entrega");
        })
        .catch((e) => {
          history.push("/");
        });
    } catch (e) {
      alert(e.message);
    }
  }

  const notify = () => toast("UserName ou password incorretos !!!");

  return (
    <div>
      <form class="form login" onSubmit={handleLogin}>
        <div id="login_table">
          <div>
            <img className="logo" src={tranportadora} alt="" />
            <strong>Boa Entrega - GSL - Login</strong>
          </div>
          <div className="input-group mb-3">
            <div className="input-group-prepend">
              <span className="input-group-text">
                <i className="fas fa-user"></i>
              </span>
            </div>
            
            <input
              type="text"
              className="form-control"
              id="username"
              placeholder="Username"
              aria-label="Username"
              aria-describedby="basic-addon1"
              value={username}
              onChange={(e) => setUsername(e.target.value)}
              required
            />
          </div>
          <div className="input-group mb-3">
            <div className="input-group-prepend">
              <span className="input-group-text">
                <i className="fas fa-lock-open"></i>
              </span>
            </div>
            <input
              type="password"
              className="form-control"
              id="password"
              placeholder="Password"
              aria-label="Username"
              aria-describedby="basic-addon1"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              required
            />
          </div>
          <Link to="/Cadastro">
            <p class="text--center">Cadastre-se Aqui</p>
          </Link>
          <button id="login" className="btn btn-dark btn-lg btn-block" onClick={notify}>
            LOGIN
          </button>
        </div>
      </form>

      <ToastContainer />
    </div>
  );
};

export default Login;
