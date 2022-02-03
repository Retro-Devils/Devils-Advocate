.class Lcom/digdroid/alman/dig/d0$o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0;->t(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Lcom/digdroid/alman/dig/d0$s;

.field final synthetic d:Lcom/digdroid/alman/dig/d0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0;ZLcom/digdroid/alman/dig/d0$s;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$o;->d:Lcom/digdroid/alman/dig/d0;

    iput-boolean p2, p0, Lcom/digdroid/alman/dig/d0$o;->b:Z

    iput-object p3, p0, Lcom/digdroid/alman/dig/d0$o;->c:Lcom/digdroid/alman/dig/d0$s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/d0$o;->b:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$o;->c:Lcom/digdroid/alman/dig/d0$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/d0$s;->b()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$o;->c:Lcom/digdroid/alman/dig/d0$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/d0$s;->a()V

    :goto_0
    return-void
.end method
