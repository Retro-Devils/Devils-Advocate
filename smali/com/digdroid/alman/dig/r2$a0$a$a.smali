.class Lcom/digdroid/alman/dig/r2$a0$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$a0$a;->a([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[Ljava/lang/String;

.field final synthetic c:Lcom/digdroid/alman/dig/r2$a0$a$b;

.field final synthetic d:Lcom/digdroid/alman/dig/r2$a0$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$a0$a;[Ljava/lang/String;Lcom/digdroid/alman/dig/r2$a0$a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$a0$a$a;->d:Lcom/digdroid/alman/dig/r2$a0$a;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$a0$a$a;->b:[Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/r2$a0$a$a;->c:Lcom/digdroid/alman/dig/r2$a0$a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$a0$a$a;->d:Lcom/digdroid/alman/dig/r2$a0$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$a0$a;->b:Lcom/digdroid/alman/dig/r2$a0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$a0;->b:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/r2$a0$a$a;->b:[Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$a0$a$a;->c:Lcom/digdroid/alman/dig/r2$a0$a$b;

    iget v0, v0, Lcom/digdroid/alman/dig/r2$a0$a$b;->a:I

    aget-object p2, p2, v0

    const-string v0, "temp_storage_dir"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/c3;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
