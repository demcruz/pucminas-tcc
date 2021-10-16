import React, {useState} from 'react'
import { Link } from 'react-router-dom'




const Cadastro = () => {

    const [email, setEmail] = useState();
  const [password, setPassword] = useState();
    return(
        <div>
            <h1>Cadstro</h1> 
             <div>
      <div class="grid">
        <form class="form login" >
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
    )
}

export default Cadastro