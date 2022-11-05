import React, { useState } from "react";
import { Link } from "react-router-dom";
import tranportadora from "../../assets/image/transportadora.png";
import api from "../../service/api";



import "./cadastro.css"

const Cadastro = () => {
  const [email, setEmail] = useState();
  const [password, setPassword] = useState();

  const handleLogin = (e) => {
    e.preventDefault()
  }



  return (
    <div className="timeline">
     
            <img className="logo" src={tranportadora} alt="" />
            <strong>Boa Entrega - GSL - Login</strong>
         
      <ul class="timeline">
        <li class="active">Dados Pessoais</li>
        <li>Seu Endereço</li>
        <li>Usuário e Senha</li>
      </ul>
      <h1>Cadstro</h1>
      <div>
        <div class="grid">
          <form class="form login" onSubmit={handleLogin}>
            <div class="form__field">
              <label for="login__username">
                <span class="hidden">Username</span>
              </label>
              <input
                autocomplete="email"
                id="email"
                type="text"
                name="email"
                class="form__input"
                placeholder="Email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                required
              />
            </div>

            <div class="form__field">
              <label for="login__password">
                <span class="hidden">Password</span>
              </label>
              <input
                id="password"
                type="password"
                name="password"
                class="form__input"
                placeholder="Password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                required
              />
            </div>

            <div class="form__field">
              <label for="login__password">
                <span class="hidden">Password</span>
              </label>
              <input
                id="pwd"
                type="password"
                name="password"
                class="form__input masked"
                placeholder="Confirmar Senha"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                required
              />
            </div>

            <div class="form__field">
              <input type="submit" value="Sign In" />
            </div>
          </form>
        </div>
      </div>
    </div>
  );
};

export default Cadastro;
