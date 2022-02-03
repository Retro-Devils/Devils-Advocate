.class Lcom/digdroid/alman/dig/m0$m$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0$m$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Lcom/digdroid/alman/dig/m0$m$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0$m$a;Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$m$a$a;->c:Lcom/digdroid/alman/dig/m0$m$a;

    iput-boolean p2, p0, Lcom/digdroid/alman/dig/m0$m$a$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/m0$m$a$a;->b:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$m$a$a;->c:Lcom/digdroid/alman/dig/m0$m$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->d:Lcom/digdroid/alman/dig/m0$p;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/m0$p;->a()V

    :cond_0
    return-void
.end method
