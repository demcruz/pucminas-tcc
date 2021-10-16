import React from "react";

import Header from "./Header/Header";
import Main from "./Main/Main";

const Layout = ({children}) => {
  return (
    <div>
      <Header />
      <Main>{children}</Main>
    </div>
  );
};

export default Layout;
