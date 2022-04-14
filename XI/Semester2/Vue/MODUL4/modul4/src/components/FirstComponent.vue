<template>
  <div class="FirstComponent">
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
export default {
  name: 'FirstComponent',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1 {
        color: white;
        padding: 10px 50px;
        background-color: rgb(94, 180, 144);
    }
</style>
