<template>
  <div class="hello">
    <h1>{{ msg }}</h1>

    <div class="login">
    <h2 class="title">Por Favor Inicie Sesion: </h2>
    <form action class="form">
      <label class="form-label" for="#email">Usuario:</label>
      <input class="form-input" type="email" id="Usuario" required placeholder="Usuario"><br><br>
      <label class="form-label" for="#password">Password:</label>
      <input class="form-input" type="password" id="password" placeholder="Password"><br><br>
      <input class="form-submit" type="submit" value="Login">
    </form>
  </div>
    
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style  scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}



<style lang="css" scoped>
.login {
  padding: 2rem;
}

.title {
  text-align: center;
}
.form {
  margin: 3rem auto;
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 20%;
  min-width: 350px;
  max-width: 100%;
  background: rgba(228, 232, 235, 0.9);
  border-radius: 5px;
  padding: 40px;
  box-shadow: 0 4px 10px 4px rgba(136, 21, 21, 0.3);
}
.form-label {
  margin-top: 2rem;
  color: rgb(8, 8, 8);
  margin-bottom: 0.5rem;
  &:first-of-type {
    margin-top: 0rem;
  }
}
.form-input {
  padding: 10px 15px;
  background: none;
  background-image: none;
  border: 1px solid rgb(17, 17, 17);
  color: white;
  &:focus {
    outline: 0;
    border-color: #1ab188;
  }
}
.form-submit {
  background: #1ab188;
  border: none;
  color: white;
  margin-top: 3rem;
  padding: 1rem 0;
  cursor: pointer;
  transition: background 0.2s;
  &:hover {
    background: #0b9185;
  }
}
</style>
