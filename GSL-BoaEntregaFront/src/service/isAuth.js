export const isAuthenticated = () => {
    const TokenStorage = localStorage.getItem('@tokenApp')
    if(TokenStorage){
        return true
    }else {
        return false
    }
}