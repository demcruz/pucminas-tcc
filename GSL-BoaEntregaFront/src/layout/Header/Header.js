import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import api from "../../service/api";


import "./style.css";

const Header = () => {
  const [isMenuOpen] = useState(true);
  const [menu, setMenu] = useState([]);
  
    const reqMenu = () => {
      api.get(`/menu/listaMenu/${localStorage.getItem("@menuApp")}`).then((res) => {
        setMenu(res.data);
      });
    }

  useEffect(() => {
    reqMenu()
  }, []);
  console.log(menu);

  function logout() {
    localStorage.clear();
  } 

  function menuBtnChange() {
    if (isMenuOpen === true) {
      let closeBtn = document.querySelector("#btn");
      let sidebar = document.querySelector(".sidebar");
      sidebar.classList.toggle("open");
      closeBtn.classList.replace("bx-menu", "bx-menu-alt-right"); //replacing the iocns class
    } else {
      let closeBtn = document.querySelector("#btn");
      let sidebar = document.querySelector(".sidebar");
      sidebar.classList.toggle("open");
      closeBtn.classList.replace("bx-menu", "bx-menu"); //replacing the iocns class
    }
  }

  return (
    <>
      <div className="sidebar open">
        <div className="logo-details">
          <div className="logo_name">Boa Entrega</div>
          <i className="bx bx-menu" id="btn" onClick={menuBtnChange}></i>
        </div>
        <ul className="nav-list">
          {/* <li>
            <i className="bx bx-search"></i>
            <input type="text" placeholder="Search..." />
            <span className="tooltip">Search</span>
          </li> */}
          {menu.map((data, i) => (
            <li key={i}>
              <Link to={`/gsl/${data.urlMenu}`}>
                <i className={`bx ${data.iconMenu} `}></i>
                <span className="links_name">{data.nameMenu}</span>
              </Link>
              <span className="tooltip">{data.nameMenu}</span>
            </li>
          ))} 

       
          <li className="profile">
            <div className="profile-details">
              <img src="profile.jpg" alt="Sair" />
            </div>

            <Link to="/gsl">
              <i className="bx bx-log-out" id="log_out" onClick={logout}></i>
            </Link>
          </li>
        </ul>
      </div>
    </>
  );
};

export default Header;
