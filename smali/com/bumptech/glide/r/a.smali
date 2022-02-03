.class public abstract Lcom/bumptech/glide/r/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/bumptech/glide/r/a<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field private A:Z

.field private b:I

.field private c:F

.field private d:Lcom/bumptech/glide/load/o/j;

.field private e:Lcom/bumptech/glide/g;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:I

.field private h:Landroid/graphics/drawable/Drawable;

.field private i:I

.field private j:Z

.field private k:I

.field private l:I

.field private m:Lcom/bumptech/glide/load/g;

.field private n:Z

.field private o:Z

.field private p:Landroid/graphics/drawable/Drawable;

.field private q:I

.field private r:Lcom/bumptech/glide/load/i;

.field private s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/bumptech/glide/load/m<",
            "*>;>;"
        }
    .end annotation
.end field

.field private t:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private u:Z

.field private v:Landroid/content/res/Resources$Theme;

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/bumptech/glide/r/a;->c:F

    sget-object v0, Lcom/bumptech/glide/load/o/j;->e:Lcom/bumptech/glide/load/o/j;

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->d:Lcom/bumptech/glide/load/o/j;

    sget-object v0, Lcom/bumptech/glide/g;->d:Lcom/bumptech/glide/g;

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->e:Lcom/bumptech/glide/g;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->j:Z

    const/4 v1, -0x1

    iput v1, p0, Lcom/bumptech/glide/r/a;->k:I

    iput v1, p0, Lcom/bumptech/glide/r/a;->l:I

    invoke-static {}, Lcom/bumptech/glide/s/c;->c()Lcom/bumptech/glide/s/c;

    move-result-object v1

    iput-object v1, p0, Lcom/bumptech/glide/r/a;->m:Lcom/bumptech/glide/load/g;

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->o:Z

    new-instance v1, Lcom/bumptech/glide/load/i;

    invoke-direct {v1}, Lcom/bumptech/glide/load/i;-><init>()V

    iput-object v1, p0, Lcom/bumptech/glide/r/a;->r:Lcom/bumptech/glide/load/i;

    new-instance v1, Lcom/bumptech/glide/t/b;

    invoke-direct {v1}, Lcom/bumptech/glide/t/b;-><init>()V

    iput-object v1, p0, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    const-class v1, Ljava/lang/Object;

    iput-object v1, p0, Lcom/bumptech/glide/r/a;->t:Ljava/lang/Class;

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->z:Z

    return-void
.end method

.method private E(I)Z
    .locals 1

    iget v0, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-static {v0, p1}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result p1

    return p1
.end method

.method private static F(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private O(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/q/d/l;",
            "Lcom/bumptech/glide/load/m<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/bumptech/glide/r/a;->S(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method private S(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/q/d/l;",
            "Lcom/bumptech/glide/load/m<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TT;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/bumptech/glide/r/a;->b0(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/bumptech/glide/r/a;->P(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    :goto_0
    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/bumptech/glide/r/a;->z:Z

    return-object p1
.end method

.method private T()Lcom/bumptech/glide/r/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    return-object p0
.end method

.method private U()Lcom/bumptech/glide/r/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->u:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->T()Lcom/bumptech/glide/r/a;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot modify locked T, consider clone()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->x:Z

    return v0
.end method

.method public final B()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->j:Z

    return v0
.end method

.method public final C()Z
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/bumptech/glide/r/a;->E(I)Z

    move-result v0

    return v0
.end method

.method D()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->z:Z

    return v0
.end method

.method public final G()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->o:Z

    return v0
.end method

.method public final H()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->n:Z

    return v0
.end method

.method public final I()Z
    .locals 1

    const/16 v0, 0x800

    invoke-direct {p0, v0}, Lcom/bumptech/glide/r/a;->E(I)Z

    move-result v0

    return v0
.end method

.method public final J()Z
    .locals 2

    iget v0, p0, Lcom/bumptech/glide/r/a;->l:I

    iget v1, p0, Lcom/bumptech/glide/r/a;->k:I

    invoke-static {v0, v1}, Lcom/bumptech/glide/t/k;->r(II)Z

    move-result v0

    return v0
.end method

.method public K()Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->u:Z

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->T()Lcom/bumptech/glide/r/a;

    move-result-object v0

    return-object v0
.end method

.method public L()Lcom/bumptech/glide/r/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lcom/bumptech/glide/load/q/d/l;->e:Lcom/bumptech/glide/load/q/d/l;

    new-instance v1, Lcom/bumptech/glide/load/q/d/i;

    invoke-direct {v1}, Lcom/bumptech/glide/load/q/d/i;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/bumptech/glide/r/a;->P(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;

    move-result-object v0

    return-object v0
.end method

.method public M()Lcom/bumptech/glide/r/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lcom/bumptech/glide/load/q/d/l;->d:Lcom/bumptech/glide/load/q/d/l;

    new-instance v1, Lcom/bumptech/glide/load/q/d/j;

    invoke-direct {v1}, Lcom/bumptech/glide/load/q/d/j;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/bumptech/glide/r/a;->O(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;

    move-result-object v0

    return-object v0
.end method

.method public N()Lcom/bumptech/glide/r/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lcom/bumptech/glide/load/q/d/l;->c:Lcom/bumptech/glide/load/q/d/l;

    new-instance v1, Lcom/bumptech/glide/load/q/d/q;

    invoke-direct {v1}, Lcom/bumptech/glide/load/q/d/q;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/bumptech/glide/r/a;->O(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;

    move-result-object v0

    return-object v0
.end method

.method final P(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/q/d/l;",
            "Lcom/bumptech/glide/load/m<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/r/a;->P(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/r/a;->f(Lcom/bumptech/glide/load/q/d/l;)Lcom/bumptech/glide/r/a;

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lcom/bumptech/glide/r/a;->a0(Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public Q(II)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/r/a;->Q(II)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, Lcom/bumptech/glide/r/a;->l:I

    iput p2, p0, Lcom/bumptech/glide/r/a;->k:I

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public R(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/g;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/r/a;->R(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/g;

    iput-object p1, p0, Lcom/bumptech/glide/r/a;->e:Lcom/bumptech/glide/g;

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public V(Lcom/bumptech/glide/load/h;Ljava/lang/Object;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/load/h<",
            "TY;>;TY;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/r/a;->V(Lcom/bumptech/glide/load/h;Ljava/lang/Object;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->r:Lcom/bumptech/glide/load/i;

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/load/i;->e(Lcom/bumptech/glide/load/h;Ljava/lang/Object;)Lcom/bumptech/glide/load/i;

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public W(Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/g;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/r/a;->W(Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/load/g;

    iput-object p1, p0, Lcom/bumptech/glide/r/a;->m:Lcom/bumptech/glide/load/g;

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public X(F)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/r/a;->X(F)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_1

    iput p1, p0, Lcom/bumptech/glide/r/a;->c:F

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "sizeMultiplier must be between 0 and 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Y(Z)Lcom/bumptech/glide/r/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/bumptech/glide/r/a;->Y(Z)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    xor-int/2addr p1, v1

    iput-boolean p1, p0, Lcom/bumptech/glide/r/a;->j:Z

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public Z(Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/m<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/bumptech/glide/r/a;->a0(Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/bumptech/glide/r/a;)Lcom/bumptech/glide/r/a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/r/a<",
            "*>;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/r/a;->a(Lcom/bumptech/glide/r/a;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p1, Lcom/bumptech/glide/r/a;->c:F

    iput v0, p0, Lcom/bumptech/glide/r/a;->c:F

    :cond_1
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/high16 v1, 0x40000

    invoke-static {v0, v1}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lcom/bumptech/glide/r/a;->x:Z

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->x:Z

    :cond_2
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/high16 v1, 0x100000

    invoke-static {v0, v1}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Lcom/bumptech/glide/r/a;->A:Z

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->A:Z

    :cond_3
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Lcom/bumptech/glide/r/a;->d:Lcom/bumptech/glide/load/o/j;

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->d:Lcom/bumptech/glide/load/o/j;

    :cond_4
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lcom/bumptech/glide/r/a;->e:Lcom/bumptech/glide/g;

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->e:Lcom/bumptech/glide/g;

    :cond_5
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v0, p1, Lcom/bumptech/glide/r/a;->f:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->f:Landroid/graphics/drawable/Drawable;

    iput v1, p0, Lcom/bumptech/glide/r/a;->g:I

    iget v0, p0, Lcom/bumptech/glide/r/a;->b:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/bumptech/glide/r/a;->b:I

    :cond_6
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v2, 0x20

    invoke-static {v0, v2}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    iget v0, p1, Lcom/bumptech/glide/r/a;->g:I

    iput v0, p0, Lcom/bumptech/glide/r/a;->g:I

    iput-object v2, p0, Lcom/bumptech/glide/r/a;->f:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lcom/bumptech/glide/r/a;->b:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/bumptech/glide/r/a;->b:I

    :cond_7
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v3, 0x40

    invoke-static {v0, v3}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lcom/bumptech/glide/r/a;->h:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->h:Landroid/graphics/drawable/Drawable;

    iput v1, p0, Lcom/bumptech/glide/r/a;->i:I

    iget v0, p0, Lcom/bumptech/glide/r/a;->b:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/bumptech/glide/r/a;->b:I

    :cond_8
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v3, 0x80

    invoke-static {v0, v3}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, p1, Lcom/bumptech/glide/r/a;->i:I

    iput v0, p0, Lcom/bumptech/glide/r/a;->i:I

    iput-object v2, p0, Lcom/bumptech/glide/r/a;->h:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lcom/bumptech/glide/r/a;->b:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/bumptech/glide/r/a;->b:I

    :cond_9
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v3, 0x100

    invoke-static {v0, v3}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-boolean v0, p1, Lcom/bumptech/glide/r/a;->j:Z

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->j:Z

    :cond_a
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v3, 0x200

    invoke-static {v0, v3}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_b

    iget v0, p1, Lcom/bumptech/glide/r/a;->l:I

    iput v0, p0, Lcom/bumptech/glide/r/a;->l:I

    iget v0, p1, Lcom/bumptech/glide/r/a;->k:I

    iput v0, p0, Lcom/bumptech/glide/r/a;->k:I

    :cond_b
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v3, 0x400

    invoke-static {v0, v3}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p1, Lcom/bumptech/glide/r/a;->m:Lcom/bumptech/glide/load/g;

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->m:Lcom/bumptech/glide/load/g;

    :cond_c
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v3, 0x1000

    invoke-static {v0, v3}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p1, Lcom/bumptech/glide/r/a;->t:Ljava/lang/Class;

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->t:Ljava/lang/Class;

    :cond_d
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v3, 0x2000

    invoke-static {v0, v3}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p1, Lcom/bumptech/glide/r/a;->p:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->p:Landroid/graphics/drawable/Drawable;

    iput v1, p0, Lcom/bumptech/glide/r/a;->q:I

    iget v0, p0, Lcom/bumptech/glide/r/a;->b:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lcom/bumptech/glide/r/a;->b:I

    :cond_e
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v3, 0x4000

    invoke-static {v0, v3}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_f

    iget v0, p1, Lcom/bumptech/glide/r/a;->q:I

    iput v0, p0, Lcom/bumptech/glide/r/a;->q:I

    iput-object v2, p0, Lcom/bumptech/glide/r/a;->p:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lcom/bumptech/glide/r/a;->b:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Lcom/bumptech/glide/r/a;->b:I

    :cond_f
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const v2, 0x8000

    invoke-static {v0, v2}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p1, Lcom/bumptech/glide/r/a;->v:Landroid/content/res/Resources$Theme;

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->v:Landroid/content/res/Resources$Theme;

    :cond_10
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/high16 v2, 0x10000

    invoke-static {v0, v2}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-boolean v0, p1, Lcom/bumptech/glide/r/a;->o:Z

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->o:Z

    :cond_11
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/high16 v2, 0x20000

    invoke-static {v0, v2}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-boolean v0, p1, Lcom/bumptech/glide/r/a;->n:Z

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->n:Z

    :cond_12
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/16 v2, 0x800

    invoke-static {v0, v2}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    iget-object v2, p1, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-boolean v0, p1, Lcom/bumptech/glide/r/a;->z:Z

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->z:Z

    :cond_13
    iget v0, p1, Lcom/bumptech/glide/r/a;->b:I

    const/high16 v2, 0x80000

    invoke-static {v0, v2}, Lcom/bumptech/glide/r/a;->F(II)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean v0, p1, Lcom/bumptech/glide/r/a;->y:Z

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->y:Z

    :cond_14
    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->o:Z

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget v0, p0, Lcom/bumptech/glide/r/a;->b:I

    and-int/lit16 v0, v0, -0x801

    iput v0, p0, Lcom/bumptech/glide/r/a;->b:I

    iput-boolean v1, p0, Lcom/bumptech/glide/r/a;->n:Z

    const v1, -0x20001

    and-int/2addr v0, v1

    iput v0, p0, Lcom/bumptech/glide/r/a;->b:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->z:Z

    :cond_15
    iget v0, p0, Lcom/bumptech/glide/r/a;->b:I

    iget v1, p1, Lcom/bumptech/glide/r/a;->b:I

    or-int/2addr v0, v1

    iput v0, p0, Lcom/bumptech/glide/r/a;->b:I

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->r:Lcom/bumptech/glide/load/i;

    iget-object p1, p1, Lcom/bumptech/glide/r/a;->r:Lcom/bumptech/glide/load/i;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/i;->d(Lcom/bumptech/glide/load/i;)V

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method a0(Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/m<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/r/a;->a0(Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/bumptech/glide/load/q/d/o;

    invoke-direct {v0, p1, p2}, Lcom/bumptech/glide/load/q/d/o;-><init>(Lcom/bumptech/glide/load/m;Z)V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v1, p1, p2}, Lcom/bumptech/glide/r/a;->c0(Ljava/lang/Class;Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1, v0, p2}, Lcom/bumptech/glide/r/a;->c0(Ljava/lang/Class;Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/q/d/o;->c()Lcom/bumptech/glide/load/m;

    move-result-object v0

    invoke-virtual {p0, v1, v0, p2}, Lcom/bumptech/glide/r/a;->c0(Ljava/lang/Class;Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;

    const-class v0, Lcom/bumptech/glide/load/q/h/c;

    new-instance v1, Lcom/bumptech/glide/load/q/h/f;

    invoke-direct {v1, p1}, Lcom/bumptech/glide/load/q/h/f;-><init>(Lcom/bumptech/glide/load/m;)V

    invoke-virtual {p0, v0, v1, p2}, Lcom/bumptech/glide/r/a;->c0(Ljava/lang/Class;Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public b()Lcom/bumptech/glide/r/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->u:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot auto lock an already locked options object, try clone() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->K()Lcom/bumptech/glide/r/a;

    move-result-object v0

    return-object v0
.end method

.method final b0(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/q/d/l;",
            "Lcom/bumptech/glide/load/m<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/r/a;->b0(Lcom/bumptech/glide/load/q/d/l;Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/r/a;->f(Lcom/bumptech/glide/load/q/d/l;)Lcom/bumptech/glide/r/a;

    invoke-virtual {p0, p2}, Lcom/bumptech/glide/r/a;->Z(Lcom/bumptech/glide/load/m;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public c()Lcom/bumptech/glide/r/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/r/a;

    new-instance v1, Lcom/bumptech/glide/load/i;

    invoke-direct {v1}, Lcom/bumptech/glide/load/i;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/r/a;->r:Lcom/bumptech/glide/load/i;

    iget-object v2, p0, Lcom/bumptech/glide/r/a;->r:Lcom/bumptech/glide/load/i;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/load/i;->d(Lcom/bumptech/glide/load/i;)V

    new-instance v1, Lcom/bumptech/glide/t/b;

    invoke-direct {v1}, Lcom/bumptech/glide/t/b;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    iget-object v2, p0, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/bumptech/glide/r/a;->u:Z

    iput-boolean v1, v0, Lcom/bumptech/glide/r/a;->w:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method c0(Ljava/lang/Class;Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TY;>;",
            "Lcom/bumptech/glide/load/m<",
            "TY;>;Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/bumptech/glide/r/a;->c0(Ljava/lang/Class;Lcom/bumptech/glide/load/m;Z)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    or-int/lit16 p1, p1, 0x800

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/bumptech/glide/r/a;->o:Z

    const/high16 v0, 0x10000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/r/a;->z:Z

    if-eqz p3, :cond_1

    const/high16 p3, 0x20000

    or-int/2addr p1, p3

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    iput-boolean p2, p0, Lcom/bumptech/glide/r/a;->n:Z

    :cond_1
    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Class;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/r/a;->d(Ljava/lang/Class;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    iput-object p1, p0, Lcom/bumptech/glide/r/a;->t:Ljava/lang/Class;

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    or-int/lit16 p1, p1, 0x1000

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public d0(Z)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/r/a;->d0(Z)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-boolean p1, p0, Lcom/bumptech/glide/r/a;->A:Z

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    const/high16 v0, 0x100000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/bumptech/glide/load/o/j;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/o/j;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/r/a;->e(Lcom/bumptech/glide/load/o/j;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/load/o/j;

    iput-object p1, p0, Lcom/bumptech/glide/r/a;->d:Lcom/bumptech/glide/load/o/j;

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/bumptech/glide/r/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/bumptech/glide/r/a;

    iget v0, p1, Lcom/bumptech/glide/r/a;->c:F

    iget v2, p0, Lcom/bumptech/glide/r/a;->c:F

    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/bumptech/glide/r/a;->g:I

    iget v2, p1, Lcom/bumptech/glide/r/a;->g:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->f:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Lcom/bumptech/glide/r/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v2}, Lcom/bumptech/glide/t/k;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/bumptech/glide/r/a;->i:I

    iget v2, p1, Lcom/bumptech/glide/r/a;->i:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->h:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Lcom/bumptech/glide/r/a;->h:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v2}, Lcom/bumptech/glide/t/k;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/bumptech/glide/r/a;->q:I

    iget v2, p1, Lcom/bumptech/glide/r/a;->q:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->p:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Lcom/bumptech/glide/r/a;->p:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v2}, Lcom/bumptech/glide/t/k;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->j:Z

    iget-boolean v2, p1, Lcom/bumptech/glide/r/a;->j:Z

    if-ne v0, v2, :cond_0

    iget v0, p0, Lcom/bumptech/glide/r/a;->k:I

    iget v2, p1, Lcom/bumptech/glide/r/a;->k:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Lcom/bumptech/glide/r/a;->l:I

    iget v2, p1, Lcom/bumptech/glide/r/a;->l:I

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->n:Z

    iget-boolean v2, p1, Lcom/bumptech/glide/r/a;->n:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->o:Z

    iget-boolean v2, p1, Lcom/bumptech/glide/r/a;->o:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->x:Z

    iget-boolean v2, p1, Lcom/bumptech/glide/r/a;->x:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->y:Z

    iget-boolean v2, p1, Lcom/bumptech/glide/r/a;->y:Z

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->d:Lcom/bumptech/glide/load/o/j;

    iget-object v2, p1, Lcom/bumptech/glide/r/a;->d:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->e:Lcom/bumptech/glide/g;

    iget-object v2, p1, Lcom/bumptech/glide/r/a;->e:Lcom/bumptech/glide/g;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->r:Lcom/bumptech/glide/load/i;

    iget-object v2, p1, Lcom/bumptech/glide/r/a;->r:Lcom/bumptech/glide/load/i;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/load/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    iget-object v2, p1, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->t:Ljava/lang/Class;

    iget-object v2, p1, Lcom/bumptech/glide/r/a;->t:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->m:Lcom/bumptech/glide/load/g;

    iget-object v2, p1, Lcom/bumptech/glide/r/a;->m:Lcom/bumptech/glide/load/g;

    invoke-static {v0, v2}, Lcom/bumptech/glide/t/k;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->v:Landroid/content/res/Resources$Theme;

    iget-object p1, p1, Lcom/bumptech/glide/r/a;->v:Landroid/content/res/Resources$Theme;

    invoke-static {v0, p1}, Lcom/bumptech/glide/t/k;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public f(Lcom/bumptech/glide/load/q/d/l;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/q/d/l;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lcom/bumptech/glide/load/q/d/l;->h:Lcom/bumptech/glide/load/h;

    invoke-static {p1}, Lcom/bumptech/glide/t/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/bumptech/glide/r/a;->V(Lcom/bumptech/glide/load/h;Ljava/lang/Object;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public g(I)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/r/a;->g(I)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, Lcom/bumptech/glide/r/a;->g:I

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/r/a;->f:Landroid/graphics/drawable/Drawable;

    and-int/lit8 p1, p1, -0x11

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public h(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/r/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/r/a;->h(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lcom/bumptech/glide/r/a;->f:Landroid/graphics/drawable/Drawable;

    iget p1, p0, Lcom/bumptech/glide/r/a;->b:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/bumptech/glide/r/a;->g:I

    and-int/lit8 p1, p1, -0x21

    iput p1, p0, Lcom/bumptech/glide/r/a;->b:I

    invoke-direct {p0}, Lcom/bumptech/glide/r/a;->U()Lcom/bumptech/glide/r/a;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/bumptech/glide/r/a;->c:F

    invoke-static {v0}, Lcom/bumptech/glide/t/k;->j(F)I

    move-result v0

    iget v1, p0, Lcom/bumptech/glide/r/a;->g:I

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->l(II)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/r/a;->f:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->m(Ljava/lang/Object;I)I

    move-result v0

    iget v1, p0, Lcom/bumptech/glide/r/a;->i:I

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->l(II)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/r/a;->h:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->m(Ljava/lang/Object;I)I

    move-result v0

    iget v1, p0, Lcom/bumptech/glide/r/a;->q:I

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->l(II)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/r/a;->p:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->m(Ljava/lang/Object;I)I

    move-result v0

    iget-boolean v1, p0, Lcom/bumptech/glide/r/a;->j:Z

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->n(ZI)I

    move-result v0

    iget v1, p0, Lcom/bumptech/glide/r/a;->k:I

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->l(II)I

    move-result v0

    iget v1, p0, Lcom/bumptech/glide/r/a;->l:I

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->l(II)I

    move-result v0

    iget-boolean v1, p0, Lcom/bumptech/glide/r/a;->n:Z

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->n(ZI)I

    move-result v0

    iget-boolean v1, p0, Lcom/bumptech/glide/r/a;->o:Z

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->n(ZI)I

    move-result v0

    iget-boolean v1, p0, Lcom/bumptech/glide/r/a;->x:Z

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->n(ZI)I

    move-result v0

    iget-boolean v1, p0, Lcom/bumptech/glide/r/a;->y:Z

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->n(ZI)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/r/a;->d:Lcom/bumptech/glide/load/o/j;

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->m(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/r/a;->e:Lcom/bumptech/glide/g;

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->m(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/r/a;->r:Lcom/bumptech/glide/load/i;

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->m(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->m(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/r/a;->t:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->m(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/r/a;->m:Lcom/bumptech/glide/load/g;

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->m(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/r/a;->v:Landroid/content/res/Resources$Theme;

    invoke-static {v1, v0}, Lcom/bumptech/glide/t/k;->m(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public final i()Lcom/bumptech/glide/load/o/j;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->d:Lcom/bumptech/glide/load/o/j;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lcom/bumptech/glide/r/a;->g:I

    return v0
.end method

.method public final k()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->f:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final l()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->p:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lcom/bumptech/glide/r/a;->q:I

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->y:Z

    return v0
.end method

.method public final o()Lcom/bumptech/glide/load/i;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->r:Lcom/bumptech/glide/load/i;

    return-object v0
.end method

.method public final p()I
    .locals 1

    iget v0, p0, Lcom/bumptech/glide/r/a;->k:I

    return v0
.end method

.method public final q()I
    .locals 1

    iget v0, p0, Lcom/bumptech/glide/r/a;->l:I

    return v0
.end method

.method public final r()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->h:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, Lcom/bumptech/glide/r/a;->i:I

    return v0
.end method

.method public final t()Lcom/bumptech/glide/g;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->e:Lcom/bumptech/glide/g;

    return-object v0
.end method

.method public final u()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->t:Ljava/lang/Class;

    return-object v0
.end method

.method public final v()Lcom/bumptech/glide/load/g;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->m:Lcom/bumptech/glide/load/g;

    return-object v0
.end method

.method public final w()F
    .locals 1

    iget v0, p0, Lcom/bumptech/glide/r/a;->c:F

    return v0
.end method

.method public final x()Landroid/content/res/Resources$Theme;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->v:Landroid/content/res/Resources$Theme;

    return-object v0
.end method

.method public final y()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/bumptech/glide/load/m<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/r/a;->s:Ljava/util/Map;

    return-object v0
.end method

.method public final z()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bumptech/glide/r/a;->A:Z

    return v0
.end method
