import React from 'react'
import { Redirect, Route } from 'react-router-dom';

import {isAuthenticated} from '../service/isAuth'


const PrivateRoute = ({component: Component, ...rest}) =>{ 
    return (
        <Route {...rest} render={props =>(
            isAuthenticated() ?
            <Component {...props} />
             :
            <Redirect to="/gsl" />
        )}/>
    )   
}

export default PrivateRoute;