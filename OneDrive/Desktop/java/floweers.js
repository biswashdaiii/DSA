const flowers = document.querySelectorAll('.flower');

flowers.forEach((flower, index) => {
  let animationDelay = index * 0.25;

  flower.addEventListener('mouseover', () => {
    flower.querySelectorAll('.flower__light').forEach((light) => {
      light.style.animationPlayState = 'running';
    });

    flower.querySelectorAll('.flower__leaf').forEach((leaf) => {
      leaf.style.animationPlayState = 'running';
    });
  });

  flower.addEventListener('mouseout', () => {
    flower.querySelectorAll('.flower__light').forEach((light) => {
      light.style.animationPlayState = 'paused';
    });

    flower.querySelectorAll('.flower__leaf').forEach((leaf) => {
      leaf.style.animationPlayState = 'paused';
    });
  });

  flower.style.animationDelay = `${animationDelay}s`;
});