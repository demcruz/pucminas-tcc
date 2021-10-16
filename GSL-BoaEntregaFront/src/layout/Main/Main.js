import React from "react";

const Main = (props) => {
  console.log(props)
  return (
    <section className="home-section">
      <div className="text">{props.children}</div>
    </section>
  );
};

export default Main;
