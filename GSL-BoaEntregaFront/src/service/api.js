import axios from 'axios'
import {controleAcesso} from '../config'

const api = axios.create({

    baseURL: controleAcesso, 
  //  timeout: 1000,
    headers: {
        "Content-Type": "application/json",
        "Access-Control-Allow-Origin": "*",
        "Authorization" :"Bearer "+ localStorage.getItem('@tokenApp')        
      }    
})
export default api