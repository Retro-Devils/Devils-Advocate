.class Lcom/digdroid/alman/dig/p2$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/p2;->Q1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/p2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/p2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/p2$h;->a:Lcom/digdroid/alman/dig/p2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$h;->a:Lcom/digdroid/alman/dig/p2;

    new-instance v1, Lcom/digdroid/alman/dig/p2$h$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/p2$h$a;-><init>(Lcom/digdroid/alman/dig/p2$h;)V

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/s2;->Y0(Lcom/digdroid/alman/dig/s2$d;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
