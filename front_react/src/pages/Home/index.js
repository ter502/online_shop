import { useState } from "react";
import { useEffect } from "react";
import Edit from "./component/Edit";
import List from "./component/List";
import "./index.css";

const Home = () => {
  const [data, setData] = useState([]);

  useEffect( () => {
    fetch("http://localhost:8081/api/users/2", { method:"GET"})
    .then(res => res.json())
    .then(data => {
      console.log(data)
    })
  },[])



  return (
    <div className="app">
      <Edit add={setData} />
      <br />
      <List listData={data} deleteData={setData} />
    </div>
  );
};

export default Home;
