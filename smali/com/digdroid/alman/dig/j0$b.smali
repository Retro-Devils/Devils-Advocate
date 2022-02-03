.class Lcom/digdroid/alman/dig/j0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/n2$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->q3()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$b;->a:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$b;->a:Lcom/digdroid/alman/dig/j0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/p1;->j0:Z

    return v0
.end method

.method public c()V
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$b;->a:Lcom/digdroid/alman/dig/j0;

    iget-wide v1, v0, Lcom/digdroid/alman/dig/j0;->L0:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    const/16 v3, 0x1c8

    invoke-static {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/ServerService;->j(Landroid/content/Context;JI)V

    :cond_0
    return-void
.end method
