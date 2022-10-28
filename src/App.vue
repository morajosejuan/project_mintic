<template>
  <div id="app">
    <nav><br>
      <router-link to="/">Papeleria</router-link> |
      <router-link to="/Administrador-View">Administrador</router-link>  |
      <router-link to="/Vendedor">Vendedor</router-link>|
      <router-link to="/Cliente">Cliente</router-link>
    </nav>
    <router-view/>
   
  </div>
</template>

<style>

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  background-image: url(../img/depositphotos_58059017.jpg);
  background-size: 100%;
  
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #030303;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
