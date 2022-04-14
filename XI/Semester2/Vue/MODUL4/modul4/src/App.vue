<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <FirstComponent msg="FirstComponent"/>
</template>

<script>
import FirstComponent from './components/FirstComponent.vue'

export default {
  name: 'App',
  components: {
    FirstComponent
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
